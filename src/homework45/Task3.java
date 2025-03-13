package homework45;
/*
15-12-2022 20-46
Запарсить строку в формат LocalDateTime.
Распечатать отдельно месяц, день, час объекта LDT

13-01-2023 00-47
Какому днб недели соответствует вторая дата
Сколько дней между этими двумя датами
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        String date1 = "15-12-2022 20-46";
        String date2 = "13-01-2023 00-47";

        // Парсинг строки в LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime ldt1 = LocalDateTime.parse(date1, formatter);
        System.out.println(ldt1);

        // Распечатать отдельно месяц, день, час объекта LDT
        LocalDateTime ldt2 = LocalDateTime.parse(date1, formatter);
        System.out.println("Месяц: " + ldt2.getMonth());
        System.out.println("День: " + ldt2.getDayOfMonth());
        System.out.println("Час: " + ldt2.getHour());

        // Какому дню недели соответствует вторая дата
        LocalDateTime ldt3 = LocalDateTime.parse(date2, formatter);
        System.out.println("День недели: " + ldt3.getDayOfWeek());

        // Сколько дней между этими двумя датами
        long days = ldt3.toLocalDate().toEpochDay() - ldt2.toLocalDate().toEpochDay();
        System.out.println("Дней между датами: " + days);

    }
}
