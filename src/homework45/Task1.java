package homework45;
/*
Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(
                "Текущая дата: " + currentDate + "\n" +
                        "Текущий год: " + currentDate.getYear() + "\n" +
                        "Текущий месяц: " + currentDate.getMonth() + "\n" +
                        "Текущий день: " + currentDate.getDayOfMonth()
        );
        System.out.println("================ День рождение ====================");
        LocalDate birthday = LocalDate.of(1981, 9, 8);
        System.out.println("Дата рождения: " + birthday);

        System.out.println("================ Проверка на равенство ====================");
        LocalDate date1 = LocalDate.of(2021, 9, 8);
        LocalDate date2 = LocalDate.of(2021, 8, 10);
        System.out.println("Дата 1: " + date1);
        System.out.println("Дата 2: " + date2);
        System.out.println("Дата 1 равна Дате 2: " + date1.equals(date2));

        System.out.println("================ Текущее время ====================");
        System.out.println("Текущее время: " + java.time.LocalTime.now());
        System.out.println("Текущее время + 3 часа: " + java.time.LocalTime.now().plusHours(3));

        System.out.println("================ Дата на неделю позже ====================");
        System.out.println("Дата на неделю позже: " + currentDate.plusWeeks(1));

        System.out.println("================ Дата на год раньше ====================");
        System.out.println("Дата на год раньше: " + currentDate.minusYears(1));

        System.out.println("================ Дата на год позже ====================");
        System.out.println("Дата на год позже: " + currentDate.plusYears(1));

        System.out.println("================ tomorrow и yesterday ====================");
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("Завтра: " + tomorrow);
        System.out.println("Вчера: " + yesterday);
        System.out.println("Завтра после сегодняшней: " + tomorrow.isAfter(currentDate));

    }
}
