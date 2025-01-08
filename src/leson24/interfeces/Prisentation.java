package leson24.interfeces;

public class Prisentation implements ColorPrintable {
    private String title;
    private String author;
    private String theme;
    private int pages;



    public Prisentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }


    @Override
    public void colorPrint() {
        System.out.println("Отправляю презентацию в презентацию в типографию!");
        System.out.println("Presentation by " + author + "; title " + title );

    }

   // @Override
   // public void defaultMethod() {

   // }

    @Override
    public void print() {
        System.out.println("Presentation " + title + "; pages: " + pages);

    }
}
