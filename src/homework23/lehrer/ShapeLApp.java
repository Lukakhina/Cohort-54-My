package homework23.lehrer;
/*
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public class ShapeLApp {
    public static void main(String[] args) {
        System.out.println("============= Круг =================\n");
        CircleL circleL = new CircleL(5);
        System.out.println(circleL.area());
        System.out.println(circleL.perimeter());

        System.out.println("=========== Прямоугольник ================\n");

        RectangleL rectangleL = new RectangleL(4,3);
        System.out.println(rectangleL.area());
        System.out.println(rectangleL.perimeter());


        System.out.println("============== Треугольник ===============\n");

        TriangleL triangleL = new TriangleL(3,6,5);
        System.out.println(triangleL.area());
        System.out.println(triangleL.perimeter());

        System.out.println("================ Не правильный треугольник ==================\n");

        TriangleL wrongTriangleL = new TriangleL(3,4,8);
        System.out.println(wrongTriangleL);

        // Первый пример массива
       // ShapeL[] shapeLS = new ShapeL[3];
       // shapeLS[0] = circleL;
       // shapeLS[1] = rectangleL;
        //shapeLS[2] = triangleL;

        // Второй пример массива который можно взять только один раз после пере присвоение он не будет работать
        ShapeL[] shapeLS = {circleL,rectangleL,triangleL};
        double totalArea = 0;
        double totalPerimeter = 0;
        for (int i = 0; i < shapeLS.length; i++) {
            totalArea += shapeLS[i].area();
            totalPerimeter += shapeLS[i].perimeter();

        }
        System.out.println("totalArea " + totalArea);
        System.out.println("totalPerimeter " + totalPerimeter);

        System.out.println("============ Треугольник сингл ==================\n");
       // TriangleSingle triangleSingle = TriangleSingle.getInstance();
       // TriangleSingle triangleSingle2 = TriangleSingle.getInstance();
        // Оно будет ровно
        // у меня нет возможности создать более одного объекта этого класса
       // System.out.println(triangleSingle2 == triangleSingle);

        TriangleSingle triangleSingleS = TriangleSingle.getInstance(3,4,8);
        System.out.println(triangleSingleS);

        triangleSingleS = TriangleSingle.getInstance(4,6,4);
        System.out.println(triangleSingleS);
        System.out.println(triangleSingleS.area());
        System.out.println(triangleSingleS.perimeter());

    }
}
