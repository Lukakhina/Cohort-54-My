package leson07;

public class StringEquals {
    public static void main(String[] args) {
        String st1 = "Java";
        String st2 = "Java";
        String st3 = "Java";

        String st4 = new String("Java");
        System.out.println(st1 + " |" + st2 + " | " + st3 + " | " + st4);

        // ==

        boolean b1 = (st1 == st2);
        System.out.println("st1 == st2: " + b1); // true
        System.out.println("st1 == st3: " + (st1 == st3)); // false
        System.out.println("st1 == st4:" + (st1 == st4)); // false

        // String pool
    }
}
