package homework07;
/*
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */

import java.util.Random;

public class Homework0702n {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(101);
        int var2 = random.nextInt(101);
        int var3 = random.nextInt(101);
        int var4 = random.nextInt(101);

        System.out.println(var1 + " | " + var2 + " | " + var3 + " | " + var4 );
        int mak = var1;
        if (var1 > mak) mak = var1;
        if (var2 > mak) mak = var2;
        if (var3 > mak) mak = var3;
        if (var4 > mak) mak = var4;
        System.out.println("Максимальная " + mak );

        }

    }

