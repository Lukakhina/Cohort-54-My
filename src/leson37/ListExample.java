package leson37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //Конструкторы
        // Конструктор ArrayList

        List<Integer> list = new ArrayList<>(); // Создает пустой список(с начальной емкостью под капотом 10 элементов)
        list = new ArrayList<>(50);
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100));
        // Создает список, содержащий все элементы переданной коллекции (копирование элементов из другой коллекции)

        //Конструктор LinkedList
        list = new LinkedList<>(); //Cоздает пустой список (внутренняя реализация на основе двусвязного списка)
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100)); // Создает список, содержащий все элементы переданной коллекции

        // Методы интерфейса List
        // boolean add(E e) - добавляет элемент в конец списка
        list.add(1000);
        list.add(-100);
        System.out.println("list = " + list);
        //void add(int index, E element) - добавляет элемент на указанную позицию
        list.add(3, 500);
        System.out.println("list = " + list);

        // E get(int index) - возвращает элемент по индексу
        Integer value = list.get(5);
        System.out.println("value = " + value);

        // E remove(int index) - удаляет элемент по индексу, возвращает старое значение
        System.out.println(list.remove(5));
        System.out.println("list = " + list);


        //Метод удаленния по значению (из интерфейса Collection) - принимает Object (ссылочный тип)
       // System.out.println(list.remove(0));
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println("list = " + list);

        // indexOf(Object o) - возвращает индекс первого вхождения элемента в список
        // lastIndexOf(Object o) - возвращает индекс последнего вхождения элемента в список
        //sort(Comparator<? super E> c) - сортирует список с помощью переданного компаратора
        //List<E> subList(int fromIndex, int toIndex) - возвращает представление части списка от fromIndex до toIndex





    }
}
