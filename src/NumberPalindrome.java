public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int tmp = number;
        while (0 != number) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        if (tmp == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
