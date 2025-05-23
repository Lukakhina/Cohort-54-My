package homework08;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.10.2024
 */
/*
Task 6
Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();

        int len = random.nextInt(11) + 5;

        int[] array = new int[len];

        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50; // [-50, 50]
            System.out.print(array[i] + ((i < array.length -1) ? ", " : "]\n"));

//            if (i < array.length -1) {
//                System.out.print(", ");
//            } else {
//                System.out.print("]");
//            }

            i++;
        }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;
        while (i < array.length) {
            sum += array[i];

            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];

            i++;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("sum: " + sum);
        System.out.println("average: " + sum / (double) array.length);



    }
}