package homework09;
/*
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */

public class Task501 {
    public static void main(String[] args) {
        String [] wort = { "One", "Two", "Twenty"};

        PrintElementArray(wort);



    }
    public static void PrintElementArray(String[] array) {
        int maxLength = 0;
        int index = 0;

        for ( int i = 0; i < 3; i++){
            int length =  array[i].length();
          if (length > maxLength) {
              maxLength = length;
              index = i;
              System.out.println("i = " + i + " length = " + length);
          }

        }
        String maxWord = array[index];
        System.out.println();
        System.out.println(maxWord);
        System.out.println("Twenty".charAt(0));
        System.out.println("Twenty".charAt(1));
        for (int i = 0; i < maxWord.length(); i++) {
            System.out.println(maxWord.charAt(i));
        }

        System.out.println(maxWord.toUpperCase());
        System.out.println(maxWord.toLowerCase());
    }
}
