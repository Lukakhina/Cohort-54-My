package leson08;


import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

            int[] arrays; // Обьявление масива целых чисел
        String[] strings; // Обьявление строк масива
        // int array1 []; // Альтернативный  способ обьявление масив . НЕ РЕКОМЕНДУЮТ использовать


        // 0 0 0 0
        arrays = new int[4]; //создали (инициализировали) масив типа int с 4 ячейками
        strings = new String[10]; // создали масив строк на 10 ячеек

        int[] array2 = new int[8];// обьявление и инстализация  масива int c 8 ячейками
        boolean[] booleans = new boolean[3]; // false, false, false
        /*
        Значение по умолчанию. При создании масивов - ячейки заполняются значениями по умолчанию.
        1. для всех числовых типов ( в том числе тип char) это будет 0 ( 0,0)
        2, Для boolean - false
        3, Для всех ссылочных типов  данных null ( null - ничто)
         */


        int value = arrays[0]; // Получить из масив значение, находится в ячейкес индексом 0
        System.out.println("value: " + value);
        System.out.println("arrays[3]: " + arrays[3]);
        System.out.println("strings[9]: " + strings[9]);
        System.out.println("booleans[1]: " + booleans[1]);


        // Разпечатать все значение в массиве так не получится
        System.out.println( "arrays: " + arrays) ; // Получили ссылку на адрес в ячейке памяти в Heap (куче)

        // Явная инсталяция масива
        int[] numbers = new int[] {45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};

        int va1 = numbers[0];
        System.out.println("va1: " + va1);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // Присвоение нового значение в ячейку с индексом 2

        System.out.println("Вынести все значение масива");
        int J = 0;
        while (J < numbers.length) {
            System.out.println(numbers[J++] + "; ");
        }
        System.out.println();

        // Создать  масив на 10 елементов и заполнить его случайным числами от 0 до 100

        Random random = new Random();

        int[] nums = new int[10];
        int k = 0;

        System.out.println("[");

        // Найти минимальное  значение в масиве.

        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }
        System.out.println(" Минимальное значение в массиве " + min);







    }
}
