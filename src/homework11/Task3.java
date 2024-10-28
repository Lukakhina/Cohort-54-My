package homework11;
/*
Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов).
 */

public class Task3 {
    public static boolean isPalindrome(int[]array) {
        int start = 0;
        int end = array.length -1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    public static void main(String[] args) {
        int[] array = { 28, 34, 34, 28};
        System.out.println(isPalindrome(array));
    }
}
