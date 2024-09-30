package homework10;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        // Вызываем метод, который вернет массив из простых чисел
        int[] primeNumbers = filterPrimeNumbers(inputArray);

        // Выводим результат
        System.out.print("Простые числа: ");
        for (int num : primeNumbers) {
            System.out.print(num + " ");
        }
    }

    // Метод для фильтрации простых чисел
    public static int[] filterPrimeNumbers(int[] arr) {
        List<Integer> primeList = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }
        return primeList.stream().mapToInt(Integer::intValue).toArray();
    }

    // Метод для проверки, является ли число простым
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
