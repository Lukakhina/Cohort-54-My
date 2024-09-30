package lesen05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите ваше иммя: ");
        String name = scanner.nextLine();

        System.out.println("name: " + name);

        // прочитать целое число
        System.out.println("Ведите ваш возраст:");
        int age = scanner.nextInt(); //Считать одно число int
        scanner.nextInt(); // скушашь остаток строки

        System.out.println("Введите ваш рост в см");
        double height = scanner.nextInt();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);


    }
}
