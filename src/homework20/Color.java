package homework20;

public class Color {
    // Базовый класс Shape с полем color
    class Shape {
        String name;
        String color;

        // Метод для установки цвета фигуры
      //  void setColor(String color) {
       //     this.color = color;
       // }

        // Метод для вывода информации о фигуре
        void displayInfo() {
            System.out.println("Фигура: " + name + ", Цвет: " + color);
        }
    }
}
