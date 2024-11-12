package leson15;




public class CatsMain {
    public static void main(String[] args) {

        // объект создан, но не могу получить информации о свойствах этого
        // Не могу вызвать методы, так как у меня нет "пульта управления"
        // (переменной которая хранит ссылку на этот объект)
        // Такой объект будет удален из памяти сборщиком мусора (Garbage Collector)
        // new Cat();


        //пульт управление
        Cat cat = new Cat(); //создаем объект класса Cat
        // 1, Физически создается объект в памяти
        // 2, вызываем конструктор класса для инициализации свойств объекта (заполнение полей начальными значениями)


        cat.sayMeow();
        cat.sleep();
        cat.run();
        String catName = cat.name;
        System.out.println("Имя: " + catName);

        // при создании объекта (экземпляра класса) Все его поля инициализируются значениями по умолчанию:
        // Для числовых примитивов (в том числе char) -> 0 / 0,0
        //boolean -> false
        //для всех ссылочных типов ( в том числе String) -> null

       // String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println(" Возвраст: " + catAge);


        System.out.println("\n=================\n");
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
        Cat cat3 = new Cat("Peter", "black, 8");
        cat3.info();

        System.out.println("\n======================\n");
        Cat cat4 = cat3;

        cat4.info();
        cat3.info();

        cat3.age = 11;
        cat3.info();
        cat4.info();

        System.out.println();
        cat4.name = "Mari";
        cat4.info();
        cat3.info();

        System.out.println("\n========= new Cat 4 =======\n");
        cat4 = new Cat("Barsik", "white",1);

        cat4.info();
        cat3.info();





    }
}
