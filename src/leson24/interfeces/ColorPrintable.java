package leson24.interfeces;
// Интерфейс может расширять другой интерфейс
// Для расширение используется ключевое слово extends
// дочерний интерфейс наследует все методы родительского интерфейса
public interface ColorPrintable extends Printable {
    void colorPrint();
    // Без этой строчки интерфейс получил бы реализацию по умолчанию от Printable
   // void defaultMethod();


}
