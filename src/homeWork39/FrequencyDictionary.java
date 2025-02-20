package homeWork39;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
// где каждому слову соответствует количество его вхождений в текст.



public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";


        Map<String, Integer> dictionaryMap = frequencyDictionary(text);

        System.out.println(dictionaryMap);



    }
    public static Map<String, Integer> frequencyDictionary(String text) {
        String[] words = text.trim().replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> dictionaryMap = new HashMap<>();
        for (String word : words) {
            dictionaryMap.put(word, dictionaryMap.getOrDefault(word, 0) + 1);
        }
        return dictionaryMap;

    }


}
