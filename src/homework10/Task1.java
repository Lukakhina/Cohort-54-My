package homework10;

public class Task1 {
    public static void main(String[] args) {
        int[] inputArray = {0, 1, 2, 3, 4, 5, 6};

        // Примеры вызова метода
        printArray(copyOfArray(inputArray, 3)); // Ожидаемый вывод: [0, 1, 2]
        printArray(copyOfArray(inputArray, 5)); // Ожидаемый вывод: [0, 1, 2, 0, 0]
    }

    // Метод для копирования массива
    public static int[] copyOfArray(int[] arr, int newLength) {
        int[] result = new int[newLength];
        for (int i = 0; i < Math.min(arr.length, newLength); i++) {
            result[i] = arr[i];
        }
        return result;
    }

    // Метод для вывода массива на печать
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
