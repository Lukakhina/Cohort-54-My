package homework07;
/*
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

import java.util.Scanner;

public class Homework0701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести число

        System.out.print("Введите число (1, 2 или 3): ");
        int userNumber = scanner.nextInt();

        // Преобразуем число в текст
        String numberText;
        switch (userNumber) {
            case 1:
                numberText = "Один";
                break;
            case 2:
                numberText = "Два";
                break;
            case 3:
                numberText = "Три";
                break;
            default:
                numberText = "Некорректное число";
        }

        // Выводим результат
        System.out.println("Вы ввели: " + numberText);

    }
}
