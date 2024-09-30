package homework09;
/*
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */

public class Task0 {
     public static void main(String[] args) {
        String inputString = "hello"; // Здесь можно заменить на любую другую строку

        // Вызываем метод, который выводит длину строки
        printStringLength(inputString);
    }

    // Метод для вывода длины строки
    public static void printStringLength(String str) {
        int length = str.length();
        System.out.println("Длина строки \"" + str + "\": " + length);
    }
}
