package homework06;
/*
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */

import java.util.Scanner;

public class Homework0603 {
    public static void main(String[] args) {
        // подготовка пользователя к  воду целое число с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Ввести целое число
        System.out.println("Ввести целое число");
        int number = scanner.nextInt();
        boolean isEven = number % 2 == 0 ;
        boolean  MultipleOfThree = number % 3 == 0;
        boolean IsTwice = isEven && MultipleOfThree;
        System.out.println("число: " + number + "четное: 2" + isEven +
                "кратно трем: " + MultipleOfThree + " четкое и равное 3: " + IsTwice );

    }
}
