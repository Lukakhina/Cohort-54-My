package leson19;

public class ConstantDemo {
    public static final double PI = 3.141519;
    public static final int[] ints = new int[10];// не является константой т.к. состояние объекта могут быть изменены
    public static final  String COUNTRY = "Germany";
    public static final String[] colors ={"red", "blue", "yellow"}; //Не константа, т.к. значения массива можно перезаписывать

    private final int x; // не константа т.к. значения переменно могут быть разными для разных объектов

    public  ConstantDemo(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public void showCountry(){
        System.out.println(" My country is " + COUNTRY);
    }
}
