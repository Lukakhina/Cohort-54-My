package leson15;


import java.util.concurrent.Callable;

public class CatsMain {
    public static void main(String[] args) {

        // объект создан, но не могу получить информации о свойствах этого
        // Не могу вызвать методы, так как у меня нет "пульта управления" (переменной которая хранит ссылку
        // Такой объект будет удален из памяти сборщиком мусора (Garbage Collector)
         new Cat();

        Cat cat= new Cat(); //создаем обькт класса Cat
        // 1, Физически создается объект в памяти
        // 2, вызываем конструктор класса для инициализации свойств объекта (заполнение полей начальными значениями


        cat.sayMeow();
        cat.sleep();
        cat.run();
        String catName = cat.name;
        System.out.println("Имя: " + catName);

        // при создании обьекта (экземпляра класса) Все его значения

        int catAge = cat.age;
        System.out.println(" Возвраст: " + catAge);

        Cat cat1 = new Cat("Max");
        cat1.sayMeow();
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println();
        cat.info();

        System.out.println("\n======================\n");
        Cat cat2 = new Cat("Diamond", "red");
        cat2.info();


                System.out.println("\n======================\n");
        Cat cat3 = new Cat("Peter", "black");
        cat3.info();

        System.out.println("\n======================\n");
        Cat cat4 = cat3;
        cat4.info();
        cat3.info();
        System.out.println();
        cat4.info();
        cat3.info();




    }
}
