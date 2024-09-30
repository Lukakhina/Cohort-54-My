package lesen05;

public class StringExample {
    public static void main(String[] args) {
        String string ="Java"; // Обьявление и инстализация переменной типа String.
        String string1 = new String("Hallo"); // Тоже создание новой строки
        System.out.println(string);
        // 1. получить количество  символа в строке ( длинна строки)
        int length = string.length();
        System.out.println("length: " + length);
        // Метод позволяет перевести все символы строки  в верхний реестр
        System.out.println(string.toUpperCase());
        System.out.println("string:" + string);
        // String имутабельна ( неизменна).
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какуюто переменную
        String stringUpper = string.toUpperCase();

        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);
        // toLowerCase() - переводит все символы строки  в нижний регистер
        // Результат работы метода  мы можем сохранить и в ту же самую переменную. Переписав ее значение
        stringUpper = stringUpper.toUpperCase();
        System.out.println("stringUpper: " + stringUpper);

        System.out.println("========================== \n");

        String str1 = "One";
        String str2 = " ";
        String str3 = "Hello";

        // Различные варианты склеивание / обьединение строк
        // Конкатенация

        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);
        // Конкателяция vs мат. операция сложения
        System.out.println(1 + 3);
        System.out.println(1 + 3 + " : " + 2 + 3);
        System.out.println(1 + 3 + " : " + (2 + 3));





    }
}
