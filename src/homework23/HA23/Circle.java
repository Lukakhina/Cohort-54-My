package homework23.HA23;

public class Circle extends Shape {
     private double radius;

     Circle(double radius){
         this.radius = radius;
     }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 *Math.PI * radius;
    }
}
