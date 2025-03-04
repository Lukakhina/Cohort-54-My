package homework40.additional;
/*
Задача 3: Частота символов
Напишите программу, которая считывает строку и подсчитывает,
сколько раз каждый символ встречается в строке. Используйте Map для хранения символов и их частоты.
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SymbolFrequency {
    public static void main(String[] args) {
        //Программа должна получать строку от пользователя. Для этого можно использовать Scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите строку : ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = new TreeMap<>();

        input.chars().forEach(ch -> {
            char character = (char) ch;
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        });

        System.out.println("Частота символов в строке:");
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
    /*
    1. input.chars().forEach(ch -> { ... })
Этот метод преобразует строку input в поток символов и затем обрабатывает каждый символ в потоке.

input.chars(): Преобразует строку в IntStream, где каждый элемент потока представляет собой код символа (целое число).

.forEach(ch -> { ... }): Проходит по каждому элементу (коду символа) в потоке и выполняет указанный блок кода.

2. char character = (char) ch;
Этот шаг преобразует целое число ch обратно в символ char.

(char) ch: Приведение типа целого числа ch (кода символа) к типу char.

3. frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
Этот шаг обновляет карту frequencyMap, увеличивая частоту символа на 1.

frequencyMap.getOrDefault(character, 0): Возвращает текущее значение частоты символа character из карты, или 0, если
символ еще не присутствует в карте.

frequencyMap.put(character, ... + 1): Увеличивает частоту символа на 1 и сохраняет новое значение в карту.

4. System.out.println("Частота символов в строке:");
Выводит заголовок для частоты символов.

5. frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
Этот шаг проходит по всем записям в карте и выводит символы и их частоту.

frequencyMap.forEach((key, value) -> { ... }): Проходит по каждой записи в карте и выполняет указанный блок кода.

System.out.println(key + ": " + value): Выводит ключ (символ) и его значение (частоту) в консоль.
     */



}
