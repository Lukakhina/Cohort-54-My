package homework08;
/*
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
 */

public class Homework080301 {
    public static void main(String[] args) {
        int count = 0;
        int number =1;
        while (count < 7) {
            if (number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
