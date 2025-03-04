package homework42;
/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {
        List<String> text1 = new ArrayList<>();
        text1.add("java");
        text1.add("Python");
        text1.add("Kotlin");
        text1.add("C++");
        text1.add("JavaScript");
        System.out.println(text1);

        Optional<String> shortestString = text1.stream()
                .min(Comparator.comparing(String :: length));
        System.out.println("минимальное значение" + shortestString);

    }
}



