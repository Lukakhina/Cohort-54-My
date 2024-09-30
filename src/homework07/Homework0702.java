package homework07;
/*
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */

import java.util.Random;

public class Homework0702 {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);


        System.out.println(" Сгенирировать числа");



        System.out.println("переменная 1: " + var1);
        System.out.println("переменная 2: " + var2);
        System.out.println("переменная 3: " + var3);
        System.out.println("переменная 4: " + var4);

        int maxNumber = Math.max(Math.max(var1, var2), Math.max(var3, var4));
        System.out.println(" Максимальное число: " + maxNumber);







    }
}
