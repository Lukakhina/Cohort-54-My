package homework18.CalculatorMein;

public class Calculator2 {
    // сумма значений
    public static int sum (int a, int b){
        return a + b;
    }
    // вычитание
    public static int subtraction (int a, int b) {
        return a - b;
    }
    // умножение
    public  static int multiplication(int a , int b) {
        return  a * b;
    }
    public static int division( int a , int b){
        if (b == 0) {
            System.out.println("Деление на ноль невозможно");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println("Сложение: " + sum(10, 5));
        System.out.println("Вычитание: " + subtraction(10, 5));
        System.out.println("Умножение: " + multiplication(10, 5));

        System.out.println("Деление: " + division(10, 2)); // Вывод: 5.0

    }



}
