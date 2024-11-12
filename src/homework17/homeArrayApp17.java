package homework17;



public class homeArrayApp17 {
    public static void main(String[] args) {

        int[] ints = {10, 20, 50, -25, 35, 45, 100, -1, 50};

       homeMagicArray17 homeMagicArray = new homeMagicArray17();

        System.out.println(homeMagicArray.toString());

        System.out.println(homeMagicArray.indexOf(10));
        System.out.println("magicArray.indexOf(500): " + homeMagicArray.indexOf(500));

        System.out.println("magicArray.removeByValue(20): " + homeMagicArray.removeByValue(20));

        // Обновление значение по несуществующему индексу
        System.out.println(homeMagicArray.set(100, 1000));

        System.out.println(homeMagicArray.toString());

        System.out.println("magicArray.set(0, 1000): " + homeMagicArray.set(0, 1000));

        System.out.println(homeMagicArray.toString());



    }
}
