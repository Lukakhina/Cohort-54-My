package lesen03;

public class Variables {

    public static void main(String[] args) {

        int myFirstVariable; // Обьявление ( дикларация) переменной типа int
        // Какойто другой код
        // Присвоение значений перменной
        myFirstVariable = 1;// Первое присвоение значение называется инициализация
        int mySecondVariable = 25; // Обьявление инициализация в одной строке
        System.out.println(mySecondVariable);
        mySecondVariable = 50; // Присвоение нового значение
        System.out.println(" Зачение переменной " + mySecondVariable);
        // byte, short, int, long
        byte byteVriabeln = 125;
        // Обьявление и инсталяция переменной типа byit
        byteVriabeln = 45;
        System.out.println(" Значение переменной " + byteVriabeln);
        short shortVar; // Обьявление переменной типа short
        shortVar = 13000; // инсталяция переменной (присвоение значение)
        System.out.println("Short value" + shortVar);
        // любое число  в коде воспроизводится компилятором как число типа int
        long longVar = 2_100_000_000; // знак _ не влияет на значение переменной. Для улутшения читаемости значение  нами
        // L в конце числа - явным образом указать , что число в формате long
        System.out.println("Long variabele: " + longVar);
        double doubleVar = 10.5421;
        System.out.println("Double variaable: " + doubleVar);
        float floatVar = 11.65f; // Явно указать, что число в формате float
        System.out.println("Float variable: " + floatVar);



    }
}
