package leson38;

import java.util.*;

public class SetExample {
    /*
    контракт между equals() и hashCode()
    Для конкретной работы хэш- коллекции есть важное правило , состоящее из трех условий
    1. Если два объекта равны по equals(), то их хэш-коды должны быть равны.
    2. Если хэш-коды двух объектов различны, то обьекты точно не равны по equals().
    обратное не обязательно верно. Разные объекты (НЕ РАВНЫЕ)могут иметь одинаковые хэш-коды(КОЛИЗИЯ).
    3. Многократный вызов метода hashCoda на неизменяемом объекте должен возвращать одинаковый результат.
     */
    public static void main(String[] args) {
        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой
        set = new HashSet<>(20); // Создает пустой с начальной емкостью 20
//       //Принимает колекцию - создает с такими же элементами
        set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 0));
        System.out.println("set :" + set);

        List<Integer> startValues = new ArrayList<>(List.of(1, 2, 3, 4, 3, 8, 6, 15, 7, 8, 9, 10));
        System.out.println("startValues: " + startValues);
        // HashSet - не гарантирует порядок элементов

        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers: " + integers);

        //LinkedHashSet - гарантирует порядок элементов
        Set<Integer> linkedSed = new LinkedHashSet<>(startValues);
        System.out.println("linkedSed: " + linkedSed);
        // Методы интерфейса Set

        //boolean add(E e) - добавляет элемент в множество
        System.out.println("Integer.add(100)" + integers.add(100));
        System.out.println(integers);
        System.out.println("Integer.add(100)" + integers.add(100)); // false - такой элемент уже есть
        System.out.println(integers);

        //boolean remove(Object o) - удаляет элемент по значению

        System.out.println("integers.remove(100): " + integers.remove(100));// true - элемент удален
        System.out.println(integers);

        // boolean contains(Object o) - проверяет наличие элемента  в множестве
        System.out.println("integers.contains(100): " + integers.contains(100)); // false - элемента нет
        System.out.println("integers.contains(10): " + integers.contains(10)); // true - элемент есть

        /*
        int size() -  количество элементов
        isEmpty() - пустое ли множество
        clear() - очистка множества
         */
        //iterator() - возвращает итератор для элементов множества
        // Наличие итератора позволяет использовать цикл for-each
        for (Integer value : integers) {
            System.out.println(value + ", ");

        }
        System.out.println();
        Iterator<Integer> integer = integers.iterator();
        while (integer.hasNext()) {
            Integer value = integer.next();
            System.out.println(value + ", ");
        }
        System.out.println();

        //убрать дубликаты из списка
        // Написать метод, который принимает список и возвращает множество без дубликатов
        // состоящий только из уникальных элементов начального значения

        System.out.println("\n===============================\n");
//        System.out.println("startValues: " + startValues);
//        Set<Integer> uniqueSet = new HashSet<>(startValues);
//        System.out.println("uniqueSet: " + uniqueSet);

        System.out.println("\n===============================\n");
        //SortedSet - конструкторы
        // Пустой = Конструктор по умолчанию - естественный порядок сортировки
        SortedSet<Integer> treeSed = new TreeSet<>(Comparator.reverseOrder());
        treeSed.add(100);
        treeSed.add(10);
        treeSed.add(50);
        treeSed.add(20);
        System.out.println("sortedSet: " + treeSed);
        // Конструктор с компаратором, ОПРЕДЕЛЯЮЩИМ ПОРЯДОК СОРТИРОВКИ);
        treeSed.addAll(startValues);
        treeSed.add(100);
        System.out.println("treeSed: " + treeSed);






    }
    private static <T> List<T> getUniqueList(List<T> list) {
        // Получить set,  содержащий все элементы
        Set<T> set = new LinkedHashSet<>(list);
        //Вернуть новый список, содержащий все элементы set-a
        return new ArrayList<>(set);
    }
}
