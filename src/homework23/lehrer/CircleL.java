package homework23.lehrer;

public class CircleL extends ShapeL {
    private double radius;

    public CircleL(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleL{" +
                "radius=" + radius +
                '}';
    }

    @Override
    double perimeter() {
        // pi * r * r
        return Math.PI * radius * radius;
    }

    @Override
    double area() {
        // 2 * pi * r
        return Math.PI * radius;
    }
}
