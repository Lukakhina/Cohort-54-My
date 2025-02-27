package leson38;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 10 , 100, -5, 0, 100, 11, 54));
        // Поиск элемента по значению - возвращает индекс
        //int indexOf(Object obj); - возвращает индекс первого вхождения элемента в список
        //Int lastIndexOf(Object obj); - возвращает индекс последнего вхождения элемента в список


        System.out.println("list.indexOf(100) : " + list.indexOf(100));
        System.out.println("list.LastIndexOf(100) : " + list.lastIndexOf(100));
        System.out.println("list.indexOf(-1000) : " + list.indexOf(-1000));
        System.out.println("list.indexOf(\"String\") : " + list.indexOf("String"));

        // void sort(Comparator<? super E> ) - сортирует список с использованием указанного компаратора

        // сортировка от большего к меньшему
        list.sort((i1, i2 )-> Integer.compare(i2, i1));
        System.out.println(list);

        // естественный метод сортировки
        list.sort(Integer::compare);

        //Эта формула сортирует список (List) в естественном порядке элементов
        // с использованием метода sort() и компаратора Comparator.naturalOrder().
        // Этот метод сортирует элементы в порядке возрастания.
        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        //List<E> subList(int idxFrom до idxTo) - возвращает список из элементов
        //находящихся на позициях от idxFrom до idxTo (не включая idxTo)
        /*
        Эта формула создает новый список, который является подсписком (sublist) исходного списка list,
         начиная с индекса 1 и заканчивая индексом 5 (не включая элемент с индексом 5).
          Подсписок включает элементы от второго до пятого (не включая пятый) элемента исходного списка.
         */
        List<Integer> subList = list.subList(1, 5);
        System.out.println( "List.sublist(1, 5) : " + subList);



    }
}
