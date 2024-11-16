package leson19;

public class LesonApp {
    public static void main(String[] args) {
        ConstantDemo demo = new ConstantDemo(10);
        System.out.println(demo.getX());

        ConstantDemo demo2 = new ConstantDemo(20);
        System.out.println(demo2.getX());

        System.out.println(ConstantDemo.COUNTRY);

        //Константа - для определения константы необходимо добавить модификаторы static final к поле класса
        //Константа - это статическое финальное поле, содержимое которого неизмененно
        // Константами могут быть примитивы, String, неизменяемые типы данных.

        // Константа - переменная, которая не может изменить ни один экземпляр(объкт) класса.
        // Константа создается и инициализируется один раз для всех обьектов, сколько бы их не было

        final  String text = "Hello World";
        String text1= text.toUpperCase();
        System.out.println(text);
        System.out.println("Новая строка, полученная с использованием значения строки text: " + text1);

    }
}
