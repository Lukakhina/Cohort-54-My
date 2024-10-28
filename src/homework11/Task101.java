package homework11;

public class Task101 {
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {54, 28, 32, 48, 59};
        System.out.println("Сумма элементов массива: " + sumArray(numbers));
    }
}
