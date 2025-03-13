package homework45;
/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<LocalDate> datesList = new ArrayList<>();

        datesList.add(LocalDate.of(2021, 1, 1));
        datesList.add(LocalDate.of(2022, 3, 25));
        datesList.add(LocalDate.of(2025, 8, 15));

        System.out.println("Дней между самой ранней и самой поздней : " + daysBetweenEarliestAndLatest(datesList));



    }

    private static String daysBetweenEarliestAndLatest(List<LocalDate> datesList) {
        LocalDate earliest = datesList.get(0);
        LocalDate latest = datesList.get(0);

        for (LocalDate date : datesList) {
            if (date.isBefore(earliest)) {
                earliest = date;
            }
            if (date.isAfter(latest)) {
                latest = date;
            }
        }
        return ChronoUnit.DAYS.between(earliest, latest) + " дней";
    }


}
