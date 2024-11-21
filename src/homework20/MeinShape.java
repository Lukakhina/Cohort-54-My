package homework20;

public class MeinShape {

    // Класс Main

        public static void main(String[] args) {
            // Создание объекта Rectangle
            Rectangle rectangle = new Rectangle();
            rectangle.figure = "Прямоугольник";
            rectangle.setDimensions(5.0, 3.0);
            rectangle.displayInfo();
            rectangle.calculateArea();

            // Создание объекта Circle
            Circle circle = new Circle();
            circle.figure = "Круг";
            circle.setRadius(4.0);
            circle.displayInfo();
            circle.calculateArea();
        }


}
