package homeWork39.myWork;
/*
Напишите метод, возвращающий частотный словарь вхождения символов в строку

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
Copy
//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1

Вхождение символов:
'
': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8; 'й': 1; 'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5; 'т': 6; 'х': 1; 'ч': 2; 'я': 3;

 */


import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
    private static Map<String, Integer> frequencyDictionary(String text) {
        String[] words = text.split("[\\s.,!?;:]+");
        Map<String, Integer> frequencyMap = new java.util.HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;

    }
    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> frequencyCharsMap = new java.util.HashMap<>();
        for (char ch : chars) {
            frequencyCharsMap.put(ch, frequencyCharsMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyCharsMap;
    }

}
