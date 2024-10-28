package homework07;
/*
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке,
 и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр
 с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

import java.util.Scanner;

public class Homework0703 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ввести четырех значное число:");
        String digitStr = scanner.nextLine();
        if (digitStr.length() != 4) {
            System.out.println("Вы ввели неверное число ");
;
        }else if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2) + digitStr.charAt(3)) {
            System.out.println("Вы ввели счастливое число ");
        } else {
            System.out.println("Вы ввели несчастливое число ");

        }


    }

}