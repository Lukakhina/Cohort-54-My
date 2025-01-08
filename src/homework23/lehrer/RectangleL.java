package homework23.lehrer;

public class RectangleL extends ShapeL{
    private double sideA;
    private  double sideB;

    public RectangleL(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "RectangleL{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
    // Обязательно после вызова extends нужно вызывать этот конструктор
    @Override
    double perimeter() {
        return sideA * sideB;
    }

    @Override
    double area() {
        return (sideA + sideB) * 2;
    }
}
