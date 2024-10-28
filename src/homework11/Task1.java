package homework11;
/*

Написать метод, который считает сумму всех элементов в массиве.
 */

public class Task1 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int umnozhenie(int a, int b) {
        return a * b;
    }

    public static int devide(int a, int b) {
        return a / b;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int sumArray2(int[] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] array = {52, 25, 2, 56};

//        System.out.println(sum(15, 31));
//        System.out.println(sum(array[0], array[1]));

        // Variant 1
        int sumArray = array[0] + array[1] + array[2] + array[3];
        System.out.println(sumArray);

        // Variant 2
        int sumArray2 = 0;
        int sumArray3 = 0;

        for (int i = 0; i < array.length; i++) {
            sumArray2 = sumArray2 + array[i]; // 0 + 52
            sumArray3 = sum(sumArray3, array[i]);
        }
        System.out.println();

//        int i = 0;
//        do {
//
//        } while (i < array.length);
    }

}
