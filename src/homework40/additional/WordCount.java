package homework40.additional;
/*
Задача 1: Подсчет слов
Напишите программу, которая считывает текстовый файл и подсчитывает,
сколько раз каждое слово встречается в файле. Используйте Map для хранения слов и их частоты.
 */

import java.util.HashMap;
import java.util.Map;



public class WordCount {
    public static void main(String[] args) {
        String setOfWords = " Чайник, ключ, строка, карта, ключ, метод, строка, ключ ";

        System.out.println(sortWordQuantity(setOfWords));






    }
    private static Map<String, Integer> sortWordQuantity ( String s){
        String[] words = s.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word, 0) +1);

        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() );

        }
        return wordCountMap;

    }



}
