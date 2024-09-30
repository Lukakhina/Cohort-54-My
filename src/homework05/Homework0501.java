package homework05;

import java.util.Scanner;

public class Homework0501 {
    /*
    Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char : одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        // просим пользователя ввести  имя
        System.out.println("name : " + name);

        // выводим  количество символов в имени

        int namelength =name.length();
        System.out.println("Количество букв в имени:" + namelength);
        // одна должна хранить первый символ имени, другая — последний.
        char firstCar = name.charAt(0);
        char lastCar = name.charAt(namelength-1);
        //Выведим на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
        int firstCarD = (int) firstCar;
        int lastCarD = (int) lastCar;
        System.out.println("Код первой буквы: " + firstCarD );
        System.out.println("Код второй буквы. " + lastCarD);












    }

    }


