package lesen03;

public class MachOperations {
    public static void main(String[] args) {
        // Ctrl + D скопировать строку
        // Alt + Shift + стрелки/ вниз  -перемещать строку по коду
        int var1 = 20;
        int var2 = 7;
        int  result;
        // Сложение
        result = var1 + var2;
        // 20 + 7 -> 27 -> result
        // Результат вычислений в правой части ( от знака =) присваевается в переменную в левой части
         System.out.println("result: " + result);
         result = 15 + 6;
         System.out.println("result:" + result);
         result = var1 + 5;
         System.out.println("resal: " + result);
         result = result + 5 ;
         System.out.println("resal: " + result);
         // Вычитание
        result = var1 - var2;
        System.out.println("resal - : " + result);
        // Умножение *
        result = var1 * var2;
        System.out.println("resal * : " + result);
        // x = 1 + 2 * 2; -> 5
        /*
        0.
        1. Умножение, деление
        2. Сложение вчитание
        */
        result = (1 + 2) * 2;
        System.out.println("resal 1 + 2 * 2 : " + result);
        // Цекличное деление/ и остаток 6; -> 20 - -> 7 -> 13 - 7 -> 6
        // 20 / 7 -> 2 целые
        result = var1 / var2; // 2,79999
        System.out.println("resal / : " + result);
        System.out.println("16 / 5:" + 15 / 5); // 3 целых  + 1 в остатке
        // % остаток от деление %
        System.out.println("Целочисленное деление 4 / 2 : " + (4 / 2)); // 2
        System.out.println(" Остаток от деления деление 4 % 2: " + ( 4 % 2)); // 0
        System.out.println( "( 5 / 10 ) = "+ ( 5 / 10));
        System.out.println( "( 5 % 10 ) = " + ( 5 % 10));
        // 28 / 10 -> 2 целые и 8 в остатке -> 2 * 10 + 8
        System.out.println( "( 28 / 10 ) = " + ( 28 / 10));
        System.out.println( "( 28 % 10 ) = " + ( 28 % 10));
        System.out.println( " ===================== \n ");
        double doubleVar1 = 20.0;
        double doubleVar2 = 7.0;
        double resultD = doubleVar1/doubleVar2;
        System.out.println("resultD: " + resultD );





    }
}
