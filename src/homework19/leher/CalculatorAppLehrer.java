package homework19.leher;

public class CalculatorAppLehrer {
    public static void main(String[] args) {

        System.out.println(CalatorLehrer.PI);
        // константа Пи уже есть в классе Math
        System.out.println(Math.PI);

        double radius = 10.6;
        double area = CalatorLehrer.circleArea(radius);

        System.out.println("area: " + area);

        System.out.println("Perimeter: " + CalatorLehrer.circlePerimeter(radius));
    }
}
