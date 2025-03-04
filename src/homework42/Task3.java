package homework42;
/*
Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
 и собрать результат в новый список
 */


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {


    public static void main(String[] args) {
       List<Integer> numbers = List.of(79,25,8,15,25,88,36,24,12,36);

        System.out.println(evenNumbers(numbers));




    }
    public static List<Integer> evenNumbers (List<Integer> integers) {
        return integers.stream()
                .filter(num -> num % 2 == 0)
                .peek(num -> System.out.println("Четное числа : " + num))
                .map(num -> num * 2)
                .peek(num -> System.out.println("Умноженное на два : " + num) )
                .collect(Collectors.toList())
                .stream().toList();



    }

}
