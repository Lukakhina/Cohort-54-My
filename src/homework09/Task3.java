package homework09;
/*
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти,
 и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.
  Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers(50, 1, 100);

        System.out.println("Сгенерированные случайные числа:");
        printArray(randomNumbers);

        int primeCount = countAndPrintPrimes(randomNumbers);
        System.out.println("Количество простых чисел: " + primeCount);
    }

    // Генерируем случайные числа в заданном диапазоне
    public static int[] generateRandomNumbers(int count, int min, int max) {
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    // Печатаем массив
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Подсчитываем и выводим простые числа
    public static int countAndPrintPrimes(int[] arr) {
        int primeCount = 0;
        System.out.println("Простые числа:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primeCount++;
            }
        }
        System.out.println();
        return primeCount;
    }

    // Проверяем, является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
