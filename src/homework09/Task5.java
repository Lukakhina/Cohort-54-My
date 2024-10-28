package homework09;
/*
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной
строки из массива.

Пример:

{"One", "Two", "Twenty"} ->

T
w
e
n
t
y
 */

public class Task5 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty"};
        printLong(array);

    }
public static void printLong(String[]array) {
        if (array == null || array.length == 0 ) {
            System.out.println("Маcсив пуст или не задан");
            return;
        }
        String longestString = " ";
        for (String str : array) {
            if (str.length()> longestString.length()){
                longestString = str;
            }
        }
        for (char ch : longestString.toCharArray()){
            System.out.println();
        }
}

}