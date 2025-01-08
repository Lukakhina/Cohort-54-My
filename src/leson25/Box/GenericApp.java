package leson25.Box;

import homework22.Task2L.Car;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hallo");

        String strVal = box.getValue();

        System.out.println(strVal.length());
        System.out.println(box.getValue().toUpperCase());

        box.setValue("Test");
        System.out.println(box);
        System.out.println(" \n====================\n");
        //Generics работают только со ссылочными типами данных
        // Т.е. НЕ работают с примитивами
       // GenericBox<int> boxInt = new GenericBox<int>(); не работает

    }


}
