package leson19;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Java is -> java is -> java is the -> java is the best
        String str = "java" + "is" + " " + "the" + " " + "best";
        /*
        StringBuilder - это специальный класс,
        предназначений для эффективного создания и модификации изменяемых последовательностей символов
         В отличие от класса String_ объекты StringBuilder могут изменяться без создания новых объектов в памяти,
         что повышает производительность при частых операциях со строками
         */

        //  Конструктор перегружаем. Может быть пустым, может принимать String
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Hallo");

        // метод для добавление в конец строки (приклеить с права) / аналог конкатенации
        sb1.append(" ");
        sb1.append("World").append("!");

        //  получить строковое представление (String)
        String string = sb1.toString();
        System.out.println(string);

        // Bcтавить символы в указанную позицию
        // "beautiful" вставить в средину строки в 6 индекс
        sb = new StringBuilder("Hello World");
        // в какую позицию вставлять, что вставлять
        sb.insert(6, "beautiful ");
        System.out.println("Hallo World");

        // "beautiful"  вставить в средину строки в 6 индекс
        // String s = "Hello World";
        // String s1 = s.substring(0, 6);
        // String s2 = s.substring(6);
        // System.out.println(s1);
        //System.out.println(s2);
        //String res = s1 + "beautiful " + s2
        //System.out.println(res);


        // Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!");
        sb.replace(6, 11, "Java"); // Верхняя граница не включается
        System.out.println(sb.toString());

        // Удалить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hallo World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());


        // Реверс - Разворачивает последовать символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        // Количество символов - длинна
        System.out.println("sb.length() " + sb.length());

        // Получить символ по индексу
        char ch = sb.charAt(3);
        System.out.println(ch);

        // Получить подстроку по индексу / индексами
        sb = new StringBuilder("Hello World!");
        String subString = sb.substring(1);
        System.out.println(subString);

        subString = sb.substring(6,9);
        System.out.println(subString);

        // Изменить размер последовательности символов
        sb = new StringBuilder("Hallo");
        System.out.println(sb.length());
        sb.setLength(10);
        // Если увеличивать строку, она будет заполнена char с кодом
        System.out.println("setLength(10): " + sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("Код символа : sb charAt(8):  " + (int) ch1);

        sb.setLength(3);
        System.out.println("setLength(3): " + sb.toString());

        System.out.println("\n====================================\n");

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] strings = example.split(" ");
        System.out.println(Arrays.toString(strings));
        /*
        Написать метод, который запрашивает у пользователя строку, состоящую и нескольких слов
        и возвращает аббревиатуру этой фразы( первые буквы каждого слова, записанные в верхнем регистре)
        Привет Джава разработчикам - ПДР
        Использовать StringBuilder
         */

        String rezult = pharseString();
        System.out.println(rezult);


    }
    private static String pharseString() {
         /*
        1. Запросить у пользователя строку
        2. Разбить строку на массив слов
        3. Перебрать все слова в цикле
        4. Из каждого слова взять первую букву, приклеить ее к результату
        5. Когда все слова перебрали - получить строку, привести ее к верхнему регистру -> вернуть
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из нескольких слов");

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        // String result = "";

        String[] words = input.split(" ");


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(word.charAt(0));
            // result = result + word.charAt(0);
        }

        return sb.toString().toUpperCase();
    }


}
