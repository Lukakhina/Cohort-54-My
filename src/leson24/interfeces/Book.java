package leson24.interfeces;
// Класс реализует (имплементирует) интерфейс
// если класс не реализовал все абстрактные методы интерфейса -
// он обязан объявить себя абстрактом
public class Book implements Printable{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book : %s (%s) \n", title, author);
    }
    public void uniqueMethod() {
        System.out.println("uniqueMethod");
    }
    // не могу переопределить приватный метод оверайт
}
