package homework05;

public class Homework0502 {
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
     */

    /*
    Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
     */

    public static void main(String[] args) {
        //Создайте строки:
        String str1 = "Java";
        String str2 = "Is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "Language";
        // Способ 1
        String concatStr = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;

        System.out.println("concatStr:" + concatStr);
        // Способ 2
        String concatStr2 = str1.concat(str2).concat(str3).concat(str4).concat(str5);

        System.out.println("concatStr2:" + concatStr2);

        //Замените в результирующей строке слово "powerful" на "super".
        String change = concatStr.replace("powerful", "super");




    }
}
