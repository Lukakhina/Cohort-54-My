package homework19;
/*
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу
        Copy
Класс должен содержать:

        - Статические методы для каждой математической операции,
         принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
        - Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
        - Константу (число Пи)

 */

public class CalculatorRadius {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        System.out.println("double division");
        return a / b;
    }

    public static int divide(int a, int b) {
        System.out.println("int division");
        if (b == 0) {
            // Todo хорошего решения нет.
            return Integer.MAX_VALUE;
        }
        return a / b;
    }
}
