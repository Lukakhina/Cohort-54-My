package homework08;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */

/*
Task 7
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */

public class Task7 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 31, -15};

        int minIndex = 0;
        int maxIndex = 0;

        int i = 0;
        while (i < array.length) {

            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }

            if (array[i] < array[minIndex]) {
                minIndex = i;
            }

            i++;
        }

        System.out.println("minIndex = " + minIndex + ", число: " + array[minIndex]);
        System.out.println("maxIndex = " + maxIndex + ", число: " + array[maxIndex]);

        // swap
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        i = 0;
        while (i < array.length) {
            System.out.print(array[i++] + ", ");
        }
        System.out.println();



    }
}