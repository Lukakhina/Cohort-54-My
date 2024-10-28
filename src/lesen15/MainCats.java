package lesen15;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создаем обьект класса Cat

        cat.sayMeow();
        cat.run();
        cat.sleep();
        /*
        При создании обьекта класса все его поля  инициализируются  значениями по умолчанию
        Для числовых приметивных типов -> 0 / 0,0
        boolean -> false
         */
    }
}
