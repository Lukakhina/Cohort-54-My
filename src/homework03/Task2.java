package homework03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.09.2024
 */

/*
Task 2
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Какой остаток от деления программа "потеряла"?
 */

public class Task2 {
    public static void main(String[] args) {
        //Скопировать строку Ctrl + D | Cmd + D
        // Удалить строку Ctrl + Y | Cmd + <-

        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        // Приоритет математических операций.
        // Сначала деление / умножение / взятие остатка. Затем + / -
        // Скобки имеют наивысший приоритет

        // 6 / 4 -> 1 целая и 2 остатке

        int average = (var1 + var2 + var3 + var4) / 4;
        int rest = (var1 + var2 + var3 + var4) % 4;

        System.out.println("average: " + average);
        System.out.println("Остаток деления на 4 равен: " + rest);

        // Option 2
        int sum = var1 + var2 + var3 + var4;
        int average1 = sum / 4;
        int rest1 = sum % 4;
        System.out.println("sum: " + sum);
        System.out.println("average1: " + average1);
        System.out.println("rest1: " + rest1);

    }
}