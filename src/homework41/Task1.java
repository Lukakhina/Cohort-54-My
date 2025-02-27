package homework41;
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные,
больше 10 и меньше 100

Для фильтрации используйте Stream API
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        // Запускает програму и вызывает метод
        filteredList();
    }

    private static void filteredList() {
        List<Integer> listOfNumbers = List.of(-5,0,5,10,15,20,35,40,80,85,100,115,150);
        List<Integer> listNew = listOfNumbers.stream()
                .filter(num -> num > 10 && num < 100)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listNew);

    }

}
