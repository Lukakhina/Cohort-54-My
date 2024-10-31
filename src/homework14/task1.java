package homework14;
// Напишите метод, который вычисляет сумму всех четных чисел в массиве

public class task1 {
    public static void main(String[] args) {
        int[]  numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Сумма всех четных чисел: " + sumEvenNumbers(numbers));
        System.out.println("Сумма всех четных чисел: " + sumEvenNumbersWhileLoop(numbers));

    }
    public static int sumEvenNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static int sumEvenNumbersWhileLoop(int[] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
            i++;
        }
        return sum;
    }

    }

