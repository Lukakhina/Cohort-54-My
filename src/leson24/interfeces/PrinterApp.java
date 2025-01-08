package leson24.interfeces;

public class PrinterApp {
    public static void main(String[] args) {
        Printable book = new Book("Философия java","Б.Эккель");
        book.print();
        // По ссылке интерфейс я не могу вызвать метод класса
        // которого нет в интерфейсе
        // book.uniqueMethod();
        // Доступные методы Object
        System.out.println(book.toString());
        book.defaultMethod();
        Printable.staticMethod();

        System.out.println("\n=================\n");
        Printable journal = new Journal("Cosmopoliten", 154);
        journal.print();
        journal.defaultMethod();

        System.out.println("\n==================\n");
        ColorPrintable colorPrintable = new Prisentation(
                "Inheritance",
                "Nomane",
                "Inheritance in OOP",
                20
        );
        colorPrintable.print();
        colorPrintable.colorPrint();
        colorPrintable.defaultMethod();
    }
}
