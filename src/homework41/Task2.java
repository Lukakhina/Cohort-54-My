package homework41;
/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A"),
удалите дубликаты и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        rowFilters();
    }

    private static void rowFilters() {
        List<String> devices = List.of("microwave", "fridge", "tofster", "extractor hood",
                "gas stove", "mixer", "meat grinder", "food processor", "washing machine");
        List<String> rowFilter = devices.stream()
                .filter(str -> str.startsWith("m"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(rowFilter);
    }
}
