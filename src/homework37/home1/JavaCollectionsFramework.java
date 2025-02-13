package homework37.home1;
/*
Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JavaCollectionsFramework {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        list1.addAll(List.of(3, 8, 4, 9, 5, 10));
        list2.addAll(List.of(4, 7, 4, 8, 6, 2));

        list1.retainAll(Collections.unmodifiableCollection(list2));
        System.out.println(list1);










    }

}
