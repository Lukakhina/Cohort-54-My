package homework05;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.09.2024
 */

/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println("количество символов в имени пользователя: " + length);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(length -1);

        System.out.println("Код первого символа: " + (int) firstChar);
        System.out.println("Код последнего символа: " + (int) lastChar);





    }
}

