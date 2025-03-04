package homework42;
/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
 отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-10, 5, -5, 0, 10, 15, 25, 20);
        System.out.println(numbers);
       System.out.println("sortByLastValue" + sortByLastValue(numbers));



    }

    private static String sortByLastValue(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 10)
               .sorted(Comparator.comparing(num -> num % 10))
                .collect(Collectors.toList())
                .toString();



    }


}
