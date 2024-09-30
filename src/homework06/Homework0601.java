package homework06;

public class Homework0601 {
    /*
    Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
 и выведите результат в виде булевой переменной
     */
    public static void main(String[] args) {
        String word  = "Programming is  fun ";
        // выведите результат в виде булевой переменной
        boolean searchFun = word.contains("fun");
        // Выводим результат
        System.out.println("содержит ли эта строка слово 'fun':" + searchFun);

    }

}
