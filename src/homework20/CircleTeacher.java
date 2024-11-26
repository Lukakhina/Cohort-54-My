package homework20;

public class CircleTeacher extends ShapeTeacher{
    private double radius;
    public static final double Pi = 3.14159;

    public CircleTeacher(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }
    public double calculateArea() {
        double area = radius * radius * Pi;
        System.out.println("The area of the circle is: " + area);
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
