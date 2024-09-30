package homework11;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};

        // Вызываем метод, который найдет среднее значение элементов массива
        double average = calculateArrayAverage(myArray);

        // Выводим результат
        System.out.println("Среднее значение элементов массива: " + average);
    }

    // Метод для вычисления среднего арифметического элементов массива
    public static double calculateArrayAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0; // Возвращаем 0, если массив пуст
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }
}
