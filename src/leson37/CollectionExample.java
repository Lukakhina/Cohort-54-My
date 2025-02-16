package leson37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        //Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // Это позволяет единообразно обрабатывать различные типы коллекций
        //Создаем коллекцию строк
        // Ссылка типа интерфейса -> определяет набор доступных методов + ссылку
        // на объект какого класса может хранить эта переменная
        // Справа мы можем подставить объекты разных классов ( получить разные реализации этого интерфейса)
        Collection<String> strings = new ArrayList<>();
        // int size() - возвращает количество элементов в коллекции
        System.out.println("strings.size())" + strings.size());
        // boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty())" + strings.isEmpty());
        // boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        System.out.println("strings.add(\"Python\")" + strings.add("Python"));
        //Переопределяем метод toString() для красивого вывода элементов коллекции
        System.out.println(strings);
        //Метод .of() - это статистический метод в нескольких интерфейсах и классах. Был выведен в Java 9
        // Создает неизменяемую коллекцию из переданных элементов
        // Доступен в List, Set, Map

        Collection<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println("integers : " + integers);
       // integers.add(7); // попытка модифицировать (изменить) неизменяемую коллекцию приведет к ошибке(Исключительная ситуация)

       /*
        strings.add("JS");
        strings.add("Go Land");
        strings.add("Ruby");
        */

        //addAll(Collection<? extends T> c) - добавляет все элементы из указанной коллекции (Сложение множеств)
        strings.addAll(List.of("JS", "Go Land", "Ruby"));

        System.out.println(strings);

        System.out.println("\n===============================\n");
        // remove(Collection<?> col) - удаляет все элементы содержащиеся в коллекции col (параметр) из коллекции на которой вызван метод (Вычитание множеств)
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 3));


        System.out.println("numbers : " + numbers);
       numbers.removeAll(List.of(3, 2, 1));
        System.out.println("numbers.removeAll (List.of()): " + numbers);

        // Пересечение множеств
        // retainAll(Collection<?> col) - оставляет только коллекции вызова только те элементы, которые есть в коллекции col (пересечение множеств)
        // Удаляет из коллекций вызова элементы , которые не содержатся в коллекции col
        //[3, 3, 2, 2, 1] retainAll[3, 2] -> [3, 3, 2, 2]

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60 ));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA : " + colA);
        System.out.println("colB : " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB) : " + colA);
//        colB.retainAll(colA);
//        System.out.println("colB.retainAll(colA) : " + colB);

        // boolean remove(Object o) - удаляет элемент из коллекции. Возвращает true, если элемент был удален
        System.out.println("сolA.remove(100) : " + colA.remove(100));
        //colA.retainAll(List.of(20)); // Удалит одно значение 20
        System.out.println("сolA.remove(20) : " + colA.remove(20));
        System.out.println("colA : " + colA);

        // clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA.clear() : " + colA);











    }
}
