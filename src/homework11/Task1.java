package homework11;

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};

        // Вызываем метод, который посчитает сумму элементов массива
        int sum = calculateArraySum(myArray);

        // Выводим результат
        System.out.println("Сумма элементов массива: " + sum);
    }

    // Метод для подсчета суммы элементов массива
    public static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
