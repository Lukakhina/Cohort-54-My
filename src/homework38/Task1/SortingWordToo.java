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

public class SortingWordToo {
    public static void main(String[] args) {

    }

    //   String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
    //  System.out.println(testString);
//     System.out.println("\n=============Второй вариант ========================\n");
//
//    // второй вариант
//    String[] words = {"Тестовая", "строка", "для", "удаления", "слов", "которые", "повторяются", "строка", "для", "удаления"};
//        System.out.println(Arrays.toString(words));
//        System.out.println("\n=====================================\n");
//        System.out.println("\n===================\n");
//        System.out.println(startValues);
//    List<Integer> resultList = test(words.);
//        System.out.println(resultList);

 //   private static <String> ArrayList<String> getUniqueSortedWords(String[] words) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
//        //list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
//        return list;
//
// private static void test(String[] words) {
//     String testStr = "Тестовая строка, со словами!";
//     // Заменяем все НЕбуквы на пустоту
//     String newStr = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
//     System.out.println(newStr);
//
//     // Преобразования строки в массив слов
//     String[] words = newStr.split(" ");
//     System.out.println(Arrays.toString(words));
//
//     // Arrays.asList(T[] array) - преобразует массив в список
//     List<String> list = Arrays.asList(words);
//     System.out.println(list);
//
//     SortedSet<String> variante = new TreeSet<>(Comparator.reverseOrder()); // Обратный естественному порядок сортvariante.addAll(words);
//     variante.add("слова");
//     System.out.println(variante);
//
//
//     variante = new TreeSet<>((i1, i2) -> i2 - i1);
//     variante = new TreeSet<>((i1, i2) -> String.valueOf(i2, i1));
//     variante.addAll(words);
//     System.out.println(variante);
// }
//



    }
