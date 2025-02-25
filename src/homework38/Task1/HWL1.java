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

public class HWL1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));

    }
    private static List<String> getUniqueSortedWords(String string) {
        /*
        1. Избавится от знаков препинания
        2. Разбить на слова (массив слов / список слов)
        3. Поместить в коллекцию, которая обеспечит уникальность и сортировку (SortedSet)
        4. Преобразовать результат в список и вернуть
         */
        // Массив слов, состоящих только из букв и цифр (без знаков препинания)
        //regex - s - Специальный знак обозначающий "пробельный символ " (пробел, табуляция, перевод каретки \r, перевод строки \n)
        // s+ - пробельный символ в количестве от 1 и более
        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я0-9]", " ").split("\\s+");
        //System.out.println("words: " + Arrays.toString(words));
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));

        return new ArrayList<>(uniqueWords);
    }

}
