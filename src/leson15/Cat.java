package leson15;

public class Cat {
    // Поля класса описывающие свойства или характеристики
    String name;
    String color;
    int age;

    // Перегрузка конструктора класса
public Cat(String catName){
    // Имя (строка) которая будет передана в конструктор
    // будет присвоено поле объекта
    name = catName;
}
// Конструктор по умолчанию. Если у нас не написан не один конструктор в классе
    // то такой конструктор нам добавляется автоматически при компиляции кода
    // но как только стоит наш конструктор то конструктор по умолчанию не добавляется
public Cat() {}


//
    public Cat(String catName,String color ){

    name = catName;
    //color = color; Такая формула не работает
    // ключевое слово this класса используется внутри класса для ссылки на текущий объект
       // this поможет для разрешение конфликта имен между полями конструкторами методов / конструкторов
        this.color = color;

    }
    // Ключевое слово this может быть использовано для вызова других конструкторов класса
    public Cat(String name, String color, int age) {
    this(name, color);// Вызов другого инструктора. Должен быть первой строкой исполняемого кода
    // Вызывается конструктор класса принимающий две стринги
    // Следующие поля будут проинициализированы
   // this.name = name;
   // this.color = color;
    this.age = age;
    }

    public void sleep(){
        System.out.println(" Я сплю!");
    }
    public void  run(){
        System.out.println("Я бегу");
    }
    public void sayMeow() {
        System.out.println("Meow");
    }
    public void info() {
      System.out.printf("Я котик %s, мой возвраст : %d , мой окрас : %s\n", name, age, color);

    }


}
