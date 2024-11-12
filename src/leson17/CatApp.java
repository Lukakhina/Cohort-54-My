package leson17;

public class CatApp {


    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        System.out.println(cat.toString());

        //System.out.println(cat.name); //name не доступно , так как помечено private
       // cat.age = - 1000; // Не доступно так как помечено private
        cat.weight = 1500;
       // cat.name = null;

        cat.age = 100; // доступен, т.к. age  имеет модификатор доступа по умолчанию package-default
        System.out.println(cat.toString());

       // cat.test(); приватный метод я не могу вызвать вне кода класса
        cat.seyMeow();

        // protected метод доступен , так как мы находимся в одном пакете
        cat.testProtected();
        System.out.println(cat.getName());

        cat.setName("Barsik");
        System.out.println(cat.getName());




    }
}
