package homework20;

public class RectangleTeacher extends ShapeTeacher{
    private double width;
    private double height;

    public RectangleTeacher(String name, String color) {
        super(name, color);
    }

    public RectangleTeacher(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }
    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        double area = width * height;
        System.out.println("Area is: " + area);
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

