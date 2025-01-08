package homework03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.09.2024
 */

/* Начало многострочного комментария
Task 1
В классе HomeWork03 задекларировать (объявить) и присвоить значения 3-м переменным.
Правильно подберите тип и имя переменным.

Переменная 1 - сколько Вам полных лет
Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))Task 1

 */


public class Task1 {
    public static void main(String[] args) {
        int age = 100;
        double priceMilk = 1.20;
        String name = "My name";

        System.out.println("My age: " + age);
        System.out.println("Milk price: " + priceMilk);
        System.out.println("Name: " + name);
    }
}