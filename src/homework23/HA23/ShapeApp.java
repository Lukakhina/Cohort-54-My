package homework23.HA23;

public class ShapeApp {
    public static void main(String[] args) {
      //  Circle circle = new Circle(6);
      //  Rectangle rectangle = new Rectangle(6, 5);
       // Triangle triangle = new Triangle(6, 8, 4);


        Shape[] shape = new Shape [3];
        shape[0] = new Circle(6);
        shape[1] = new Rectangle(6,5);
        shape[2] = new Triangle(6,8,4);

        double togetherArea = 0;
        double togetherPerimeter = 0;

        for (int i = 0; i < shape.length; i++) {
            Shape shapes = shape[i];
            System.out.println();


            togetherArea += shapes.getArea();
            togetherPerimeter += shapes.getPerimeter();
            System.out.println(" Площадь фигуры  " + shapes.getArea() + " " + shape[i].getClass().getName());
            System.out.printf("%.2f\n ", shapes.getArea());
            System.out.println(" ПЕРИМЕТЕР фигуры " +  shapes.getPerimeter()  + " " + shape[i].getClass().getName());
            System.out.printf("%.2f\n ", shapes.getPerimeter());




        }

        System.out.println("====================================");
        System.out.println("Общая площадь  " + togetherArea  );
        System.out.println("Общий  ПЕРИМЕТЕР " + togetherPerimeter);
    }


}
