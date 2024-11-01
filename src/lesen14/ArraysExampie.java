package lesen14;

import java.util.Arrays;
import java.util.Random;

public class ArraysExampie {
    public static void main(String[] args) {


        int[] array = {3, 2, 1, 0};

        // Возвращает строковое представление массива
        String arrayToSring = Arrays.toString(array);
        System.out.println(arrayToSring);

        // Это заместь двух этих формул можно написать одну
        System.out.println(Arrays.toString(array));

        //sort - Сортирует указанный массив
        Arrays.sort(array);
        // Составляет массив по возврастанию
        System.out.println(Arrays.toString(array));

        //binarySearch - бинарный поиск (массив должен быть отсортирован)
        // возвращает он индекс элемента. Если не найден - (возвращает минус один)
        // возвращает отрицательное значение
        int index = Arrays.binarySearch(array,3);
        System.out.println("index: " + index);
        // показывает индекс троечке равно троечке, значение соответствует индексу
        // если мы запишем значение которого нет в массиве,
        // то index выдаст минусовое значение к пр.(-5)


        // Метод проверяет равны ли два массива
        int[] test = {0, 1, 2, 3};
        boolean iaArrayEquals =Arrays.equals(array, test);
        System.out.println("ifArrayEquals: " + iaArrayEquals);

        // Метод находит и возвращает индекс первого различия между массивами
        int mismatchindex = Arrays.mismatch(array, test);
        System.out.println("mismatchindex: " + mismatchindex);


        // двух мерные массивы добавляем квадратные скобки
        int[][] arrayD = new int[6][5];
        // возвращает строковое представление многомерных массивов (включая вложенные массивы)
        System.out.println(Arrays.deepToString(arrayD));

        // Метод для сравнения многомерных массивов deepEquals
        // Метод  для сравнение одномерных массивов  equals
        int[][] arrayC = new  int[6][5];
        arrayC[2][3] = 1;
        System.out.println(Arrays.deepToString(arrayC));
        System.out.println(Arrays.deepEquals(arrayC, arrayD));

        // перебрать все значение одномерного массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +  ", ");
        }
        System.out.println();

        // Перебрать все значение двухмерного значение (многомерного) массива
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++) {
                System.out.println(arrayC[i][j] + ", ");

            }
            System.out.println();

        }


        System.out.println("\n===================================\n");


        // copyOf - Метод копирует массив или его часть в новой массив
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));

        int[] copyOfTest2 = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest2));


        // Метод заполнения массива значением
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        // часть массива от стартового (включительно) индекса до конечного ( не включительно)
        Arrays.fill(arr, 1, 4, 1000);
        System.out.println(Arrays.toString(arr));


        //
        Random random = new Random();
        // Значение генерируются один раз . Весь массив заполняется одним значением
        Arrays.fill(arr, random.nextInt(1001));
        System.out.println(Arrays.toString(arr));


        //очень гибкий инструмент для копирование массива / части массива в другой массив
        int[] copy = new int[10];
        // Начинай пожалуйста брать элементы с первой ячейки
        // какой массив вставлять ( сору)
        //начиная с какой ячейки (3)
        // возьми мне пожалуйста (2) элемента
        // метод принимает  5 значений
        System.arraycopy(arr, 1,copy, 3, 2);
        System.out.println(Arrays.toString(copy));




        // Строка с гласными буквами
        String vowels = "aeiouAEIOU";
        // indexOf, contains
        // Буква -> знак пунктуации
        // принимает char -> возвращает true символ - буква (любая буква почти любого алфавита)
        //System.out.println(Character.isLetter( ));





    }
}
