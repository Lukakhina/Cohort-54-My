package leson26.methods;

import leson26.lists.MyArrayList;
import leson26.lists.MyList;

import java.util.ArrayList;
import java.util.List;


public class MethodApp {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        String[] strings = {"a", "b", "c", "d"};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        String str = UtilsGeneric.printArray(integers);
        System.out.println(str);

        String str1 = UtilsGeneric.printArray(strings);
        System.out.println(str1);

        String str2 = UtilsGeneric.printArray(doubles);
        System.out.println(str2);

        System.out.println("\n ====================== \n");
        UtilsGeneric.swap(doubles, 0, 3);
        System.out.println(UtilsGeneric.printArray(doubles));

        double sum = UtilsGeneric.sum(integers);
        System.out.println(sum);

        sum = UtilsGeneric.sum(doubles);
        System.out.println(sum);

        System.out.println("\n ====================== \n");

       // MyList<Integer> integerMyList = new MyArrayList<>();
        MyList<? extends Number> integerMyList = new MyArrayList<>();

     //   MyList<String> stringMyList = new MyArrayList<>();
        MyList<String> stringMyList = new MyArrayList<>();
       // integerMyList.addAll(ArrayList(1, 2, 3, 4, 5));
        integerMyList.addAll();
       /* double sumInt = UtilsGeneric.listSum(integerMyList);*/
        double sumInt = UtilsGeneric.listSum(integerMyList);

        System.out.println("sumInt: " + sumInt);;
        // Ошибка компиляции
       // sumInt = UtilsGeneric.listSum(stringMyList);

        //MyList<Double> doubleMyList = new MyArrayList<>();
        MyList<Double> doubleMyList = new MyArrayList<>();

       // UtilsGeneric.addNumbers(integerMyList);
        System.out.println(integerMyList);




    }
}