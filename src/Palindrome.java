public class Palindrome {
    private static boolean isPalindrome(String string) {
        for (int i = 0, j = string.length() - 1; i <= j; ) {
            while (!Character.isLetter(string.charAt(i))) {
                i++;

                if (i > j) {
                    return true;
                }
            }

            while (!Character.isLetter(string.charAt(j))) {
                j--;

                if (i > j) {
                    return true;
                }
            }

            char leftChar = Character.toLowerCase(string.charAt(i));
            char rightChar = Character.toLowerCase(string.charAt(j));

            if (leftChar != rightChar) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        // String string = "qweEWQ                 ";
        // String string = "          qweEWQ";
        // String string = "1234";
        // String string = "123qwert123";
        // String string = "+-=&%!@/*";
        // String string = "     ";

        System.out.println("It's a palindrome?: " + isPalindrome(string));
    }
}
