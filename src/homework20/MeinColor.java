package homework20;

public class MeinColor {
    public static void mainColor(String[] args) {
        // Создание объекта Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.figure = "Прямоугольник";
      //  rectangle.setColor("Красный");
        rectangle.setDimensions(5.0, 3.0);
        rectangle.displayInfo();
        rectangle.calculateArea();

        // Создание объекта Circle
        Circle circle = new Circle();
        circle.figure = "Круг";
       // circle.setColor("Синий");
        circle.setRadius(4.0);
        circle.displayInfo();
        circle.calculateArea();
    }
}
