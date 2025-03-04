package homework42;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

public class Task2_2 {
    public static void main(String[] args) {
        List<String> text = List.of("В"," математике", "восклицательный", "знак");

        // Сортировка по длине строк
        List<String> lengthString = text.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(lengthString);

        // Строка с минимальной длиной
        List<String> minimumStringLength = text.stream()
                .filter(s -> s.length() == text.stream()
                        .min(Comparator.comparing(String::length))
                        .get()
                        .length())
                .collect(Collectors.toList());
        System.out.println(minimumStringLength);
    }
}
