package leson18;

public class FinalDemo {
    // Для примитивных типов данных, помеченных как final:
    // После инициализации (присвоении первого значения) - изменить значение в переменной нельзя
    private final int capacity = 10;
    // Ссылочные типы данных. Нельзя изменить значение переменной (привязать новый объект)
    // Состояние объекта я могу изменить
    private final int[] ints = new  int[capacity];
    private int notFinal;

    public FinalDemo(int capacity) {
        // нельзя поменять значение final переменной
       // this.capacity = capacity;
        // Нельзя присвоить ссылку на другой объект
        //this.ints = new int[2];
        ints[0] = 100;
        ints[0] = 200;
        ints[5] = 300;
    }
    // Параметры метода тоже можно пометить как final
    //  что внутри метода невозможно изменить значение переменной
    public void finalTest(final int x, final int[] array) {
       // x = 100;
        System.out.println(x);

        //Могу изменять состояние объекта
        ints[0] = 100;
        ints[1] = 200;
        // Но не могу присвоить ссылку на другой объект
        // array = new int [100];

    }
    // Сеттеры для финальных полей не генерируем
   // public void setCapacity(int capacity) {
   // this.capacity = capacity;
   //}

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}
