package homework20;

public class ShapeAppTeacher {
    public static void main(String[] args) {

        RectangleTeacher rectangleTeacher = new RectangleTeacher("Прямоугольник", "Red");
        rectangleTeacher.setDimensions(5.5, 7.43);

        rectangleTeacher.displayInfo();
        rectangleTeacher.calculateArea();

        RectangleTeacher rectangleTeacher1 = new RectangleTeacher("Rectangle","Yellow",10, 20);
        rectangleTeacher1.displayInfo();
        rectangleTeacher1.calculateArea();

        System.out.println("Circle");

        CircleTeacher circleTeacher = new CircleTeacher("Circle","Blue",8.5);
        circleTeacher.setRadius(9.5);
        circleTeacher.displayInfo();
        circleTeacher.calculateArea();

    }
}
