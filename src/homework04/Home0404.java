package homework04;
/*
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.

Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
    }
}
 */

public class Home0404 {
    public static void main(String[] args) {


        char ch1 = 't';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'y';
        char ch5 = 'a';


        // перемещенная буква алфавита будет сответствии десятичного кода



        ch1 -= 32;
            ch2 -= 32;
         ch3 -= 32;
        ch4 -= 32;
         ch5 -= 32;

        System.out.println("ch1:" + ch1);
        System.out.println("ch2:" + ch2);
        System.out.println("ch3:" + ch3);
        System.out.println("ch4:" + ch4);
        System.out.println("ch5:" + ch5);

        System.out.println("My name :" + ch1 + ch2 + ch3 + ch4 + ch5);
    }
}
