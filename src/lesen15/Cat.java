package lesen15;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String catName) {
        name = catName;
    }
    public Cat(){

    }
    public void sleep(){
        System.out.println("Я сплю!");
    }
    public void run() {
        System.out.println("Я бегу!");
    }
    public void sayMeow() {
        System.out.println("Meow!");
    }
    public void whoAmi() {
        System.out.println("Я котик %s, мой возраст:%d, мой окрас:%\n");
    }


}

