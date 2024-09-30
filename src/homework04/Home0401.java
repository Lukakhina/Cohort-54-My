package homework04;
/*
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
 */

public class Home0401 {
    public static void main(String[] args) {
        // Обьявляем  переменную типа int и приваеваем  и присваеваем ей значение 10
        int intValue = 10;
        // присваеваем значение intValue переменной типа double с именем doubleValue

        double  myDouble= intValue;
        // Выводим значение  doubleValue на экран
        System.out.println("myDouble :" + myDouble);



    }

}

