package homework07;
/*
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7. Если число равно 1,
 выводим на консоль "Понедельник",
 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
 */

import java.util.Scanner;

public class Homework0704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Просим пользователя ввести  число от 1 до 7
        System.out.print("Введите число от 1 до 7: ");
        int userNumber = scanner.nextInt();

        // Используем оператор switch для определения дня недели
        String dayOfWeek;
        switch (userNumber) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
            case 7:
                dayOfWeek = "Выходной";
                break;
            default:
                dayOfWeek = "Некорректное число";
        }

        // Выводим результат
        System.out.println("День недели: " + dayOfWeek);


    }
}
