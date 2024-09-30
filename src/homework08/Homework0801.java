package homework08;
/*
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */

public class Homework0801 {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 15; i++) {
            product *= i;
        }
        System.out.println("Произведение всех чисел от 1 до 15: " + product);
    }

}
