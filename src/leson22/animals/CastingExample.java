package leson22.animals;

import java.util.concurrent.Callable;

public class CastingExample {
    public static void main(String[] args) {
        // Восходящее и нисходящее преобразование
        // Восходящее преобразование - это возможность присвоить
        // переменной типа предка ссылку на объект потомка
        Cat cat = new Cat();
        Animal animal = cat; // Восходящее преобразование
        Animal animal1 = new Cat(); // Тип объекта Cat автоматически преобразуется к типу Animal
        // Восходящее преобразование является безопасным, т.к. у родительского класса ГАРАНТИРОВАННО
        // есть все методы родительского класса.
        /*
        Тип ссылочной переменной определяет:
        1. Ссылки на объекты каких типов здесь могут храниться (быть присвоены)
        2. Какие методы мне доступны для вызова с этой переменной
         */
        animal1.voice();
        System.out.println("\n======================\n");
        Animal animal2 = new Dog(); // Неявное автоматическое преобразование
        Animal animal3 = new Hamsster();

        Animal[] animals = new  Animal[3];
        animals[0]=animal1;
        animals[1]=animal2;
        animals[2]=animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();

        }

        System.out.println("\n=======DownCasting==========\n");

        Cat catLink = new Cat();

        Animal animalLink =new Cat();
        //animalLink.eat(); на ссылке типа Animal метод eat()  из класса Cat не доступен к вызову.

        catLink = (Cat) animalLink; // Нисходящее ЯВНОЕ преобразование. Не является безопасным
        catLink.eat();

        //double y = 10.50;
       // int x = (int) y;

        for (int i = 0; i < animals.length; i++) {
            Animal current = animals[i];
            System.out.println("sout: " + current);

            // getClass - получить тип объекта. //.getSimpleName()
            System.out.println("getClass: " + current.getClass());
            // instanceof - проверить, проверить, является ли объект экземпляром нужного подкласса
            // можно ли преобразовать объект к типу ссылки

            Cat tempCat = (Cat) current; // Не безопасное преобразование
            tempCat.eat();


            // Можно ли присвоить  ссылку на объект типа Cat
            if (animals[i] instanceof Cat){
                System.out.println(i + "-й индекс можно безопасно привести к Cat");
               // Cat tempCat = (Cat) animals[i]; // Не безопасное преобразование TODO
                tempCat.eat();

            }
            System.out.println("=================\n");

        }
    }
}
