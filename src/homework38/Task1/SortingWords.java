package homework38.Task1;
/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.*;
import java.util.stream.Collectors;



public class SortingWords<T>  {
    public static void main(String[] args) {
        // List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        LinkedList<String> startValues = new LinkedList<>(List.of("Тестовая", "строка", "для",
                "удаления", "слов", "которые", "повторяются", "строка", "для", "удаления"));
        System.out.println(startValues);
        System.out.println("\n=====================================\n");
        System.out.println(getUniqueSortedWords(startValues.toString()));

    }

    public static List<String> getUniqueSortedWords(String text) {

        List<String> words = Arrays.asList(text.split("[^а-яА-Яa-zA-Z]+"));
        return words.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
                .collect(Collectors.toList());
    }


}
