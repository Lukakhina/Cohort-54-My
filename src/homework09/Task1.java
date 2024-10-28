package homework09;
/*
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается
в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Copy
Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в
 обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6, 7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }
    public static void reverse(int[] arr) {
    int tmp = 0;
    for (int I = 0, j = arr.length - 1; I < j; I++, j--) {
        tmp = arr[I];
        arr[I] = arr[j];
        arr[j] = tmp;
    }
    }
}
