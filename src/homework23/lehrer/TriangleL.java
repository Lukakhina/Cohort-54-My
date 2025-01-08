package homework23.lehrer;

public class TriangleL extends ShapeL{
    private double a;
    private  double b;
    private double c;

    public TriangleL(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (!isValidSides()) {
            // невозможно составить треугольник?
            // TODO а можно ли не создавать объект?
            System.out.println("Invalid sides ");
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
    }

    private boolean isValidSides() {
        // эта формула, для того чтобы обезопасить от не правильно заданных сторон треугольника
        return a < b + c && b < a + c && c < a + b;
    }
    @Override
    public String toString() {
        return "TriangleL{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    @Override
    double area() {
        double area;
       double p2 =perimeter() / 2;
       area = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
       return area;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}
