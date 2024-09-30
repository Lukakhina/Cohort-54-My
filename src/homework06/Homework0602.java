package homework06;

import java.util.Random;



public class Homework0602 {
//Создайте две переменные типа int.

    public static void main(String[] args) {
        // В первую переменную запишите случайное значение от 0 до 50.
        //Во вторую переменную случайное значение от 0 до 100.
        Random random = new Random();

        int a = random.nextInt(51); // возв
        int b = random.nextInt(101);
        //(опционально) Во вторую переменную случайное значение от -20 до 30.
        int option = random.nextInt(51) - 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("option = " + option);
        boolean equal = a == b;
        boolean notEqual = a != b;
        boolean aGreaterThanB = a > b;
        boolean bLessThanA = b < a;
        System.out.println("a равно b: " + equal);
        System.out.println("a не равно b: " + notEqual);
        System.out.println("a больше b: " + aGreaterThanB);
        System.out.println("b меньше a: " + bLessThanA);



    }


}
