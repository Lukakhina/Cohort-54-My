package homework38.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static homework38.Task1.SortingWords.getUniqueSortedWords;

public class SortingWortThree {
    public static void main(String[] args) {


        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(" Слова : " + getUniqueSortedWords(testString));

    }
    public static List<String> getUniqueSortedWords(String testString) {
        testString = testString.trim().replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println("string: " + testString);
        String[] words = testString.split(" ");

        List<String> uniqueWords = new ArrayList<>();

        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
            uniqueWords.sort(String::compareTo);
        }


        return SortingWords.getUniqueSortedWords(testString);

    }


}
