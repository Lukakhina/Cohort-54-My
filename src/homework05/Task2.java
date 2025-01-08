package homework05;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.09.2024
 */

/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */

public class Task2 {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String space = " ";

        String concatStr = String.join(space, str, str1, str2, str3, str4);
        System.out.println("concatStr1: " + concatStr + "; длина строки: " + concatStr.length());

        concatStr = str.concat(space)
                .concat(str1).concat(space)
                .concat(str2).concat(space)
                .concat(str3).concat(space)
                .concat(str4);

        System.out.println("concatStr2: " + concatStr + "; длина строки: " + concatStr.length());

        String result = concatStr.replace("powerful", "super");
        System.out.println("result: " + result);


        // Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        boolean isContains = result.contains("age");
        System.out.println("isContains: " + isContains);


    }
}



