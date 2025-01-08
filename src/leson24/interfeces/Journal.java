package leson24.interfeces;

public class Journal implements Printable{
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + " " + number);
    }

    @Override
    public void defaultMethod() {
        Printable.super.defaultMethod();
        System.out.println("Default method from interface");
        //Специфика обращения  к интерфейсу в качестве "super"
        //Printable.super.defaultMethod();
    }
}
