package homework08;
/*
Найдите произведение всех чисел от 1 до 10 включительно.

Результат выведите на экран
 */

public class Homework080101 {
    public static void main(String[] args) {
        long namber = 1;
        int I = 1;
        while (I <= 10) {
            namber*=I++;
        }
        System.out.println("Произведение всех чисел:  " + namber);
    }
}
