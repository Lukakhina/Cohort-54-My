package homework37.ArrayList;
/*
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.


 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CompareListWorkTime {
    private static final int Capacity = 150_000;
    private static final int BOUND = 1_000;
    private static final int INSERT_COUNT = 10_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < Capacity; i++) {
            int value = random.nextInt(BOUND +1);
            arrayList.add(value);
            linkedList.add(value);

        }
        System.out.println("Array size : " + arrayList.size());
        System.out.println("Linked size : " +linkedList.size());

        // Засекание времени (массив времени содержит)
        long start = System.currentTimeMillis();
        arrayList.contains(2000);
        long end = System.currentTimeMillis();
        System.out.println("Time array contains: " + end + start );

         start = System.currentTimeMillis();
        arrayList.contains(2000);
         end = System.currentTimeMillis();
        System.out.println("Time linked contains: " + end + start );

        System.out.println("\n=====================================\n");

        start = System.currentTimeMillis();

        System.out.println("get array : " +  getElements(arrayList));
        System.out.println("insert array : " + insertElements(arrayList));
        System.out.println("deleteBayIndex : " + deleteBayIndex(arrayList));
        System.out.println("deleteBayValue : " + deleteElementsBayValue(arrayList));
        end = System.currentTimeMillis();

        System.out.println("\n Общее время работы ArrayList: " + end + start);

        System.out.println("\n=====================================\n");

        start = System.currentTimeMillis();

        System.out.println("get linked : " +  getElements(linkedList));
        System.out.println("insert linked : " + insertElements(linkedList));
        System.out.println("deleteBayIndex : " + deleteBayIndex(linkedList));
        System.out.println("deleteBayValue : " + deleteElementsBayValue(linkedList));

        end = System.currentTimeMillis();

        System.out.println("\n Общее время работы LinkedList: " + end + start);



    }

    //Вставка 2_000 новых значений по случайному индекс�� (диапазон индексов от 0 до размера списка)
    public static long insertElements(List<Integer> integers) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        for (int i = 0; i < INSERT_COUNT; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(BOUND + 1));
            
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
    // Получение всех элементов
    public static long getElements(List<Integer> integers) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);

        }

        long end = System.currentTimeMillis();
        return end - start;
    }
    //Удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
    public static long deleteBayIndex(List<Integer> integers) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < INSERT_COUNT / 2; i++) {
            integers.remove(random.nextInt(integers.size()));
        }
        long end = System.currentTimeMillis();
        return end - start;

    }
    //Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    public static long deleteElementsBayValue(List<Integer> integers) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < INSERT_COUNT / 2; i++) {
            integers.remove(Integer.valueOf(random.nextInt(10000 + 1)));
        }
        long end = System.currentTimeMillis();
        return end - start;

    }

}
