package homework07;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024
 */

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("введите строку");
        String inputStr = scanner.nextLine();

        System.out.println("Введите число 1, 2 или 3");
        int input = scanner.nextInt(); // в тип данных int -> он считывает токен
         scanner.nextLine(); // В тип данных String -> от начала строки до конца строки

        System.out.println("Введите ваш возврат:");
        int age = scanner.nextInt();


        System.out.println("inputStr " + inputStr);
        System.out.println("input: " + input);
        System.out.println("age: " + age);



    }
}