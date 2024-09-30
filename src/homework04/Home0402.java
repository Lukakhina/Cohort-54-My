package homework04;
/*
Task 2
Явное преобразование double в int
Напишите программу, которая:

Объявляет переменную double с именем myDouble и присваивает ей значение 5.99.
Преобразует myDouble в int с помощью явного преобразования и сохраняет результат в переменную int с именем myInt.
Выводит значение myInt на экран.
Ожидаемый результат:
 */

public class Home0402 {
    public static void main(String[] args) {
        //Обьявляем переменную типа  double  и приваеваем ей значение 5.99
        double MyDouble = 5.99;
        int MyInt = (int)  MyDouble;
        // явное преобразование double в int

        System.out.println("MyDouble: " + MyDouble);
        System.out.println("MyInt: " + MyInt);

        // Выведется 5 ( Дробная часть теряется)


    }
}
