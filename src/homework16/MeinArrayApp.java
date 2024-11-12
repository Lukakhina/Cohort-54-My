package homework16;

public class MeinArrayApp {
    public static void main(String[] args) {

        MeinMagicArray myArray = new MeinMagicArray();

        System.out.println(myArray.toString());

        System.out.println("size: " + myArray.size());

        myArray.add(100);
        myArray.add(200);

        // Получаем строковое представление нашего объекта(массива)
        String info = myArray.toString();
        System.out.println(info);
        System.out.println("size: " + myArray.size());

        System.out.println("\n===========================\n");
        myArray.addAll(300, 400, 500, 600, 700, 800, 1000, 1100, 2000);
        System.out.println(myArray.toString());




    }



}
