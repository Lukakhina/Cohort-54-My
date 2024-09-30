package homework05;

import java.util.Scanner;

public class Homework0503 {
    /*
    Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct"

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Попросите пользователя ввести строку чётной длины с клавиатуры.
        System.out.println("Ввести строку четной длины:");
        String string1 = scanner.nextLine();
        // проверяем что длинна строки  четная
        if (string1.length()% 2 == 0) {
            // находим индекс среднего символа
            int even = string1.length() / 2;

            // получаем два средних символа
            char even1 = string1.charAt(even - 1);
            char even2 = string1.charAt(even);
            // Выводим  результат
            System.out.println("Два средних символа: " + even1 + even2 );


        }
    }

}