package homework10;
/*
Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент, который будет
находиться на k-й позиции в объединенном отсортированном массиве.

Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7
Copy
Вывод: 256

Можно такой вывод:

72, 86, 100, 112, 113, 119, 256
Искомое число: 256
Copy
Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -

[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
Copy
7-й элемент (по счету) этого массива хранит значение 256.


 */

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = findKElement(array1, array2, k);
        System.out.println(" Искомое число " + result);



    }//stat

    public static int findKElement( int[] array1,  int[] array2,int k) {
        int i = 0, j = 0, count = 0;
        int result = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result = array1[i];
                i++;
            } else {
                result = array2[j];
                j++;

            }
            count++;
            if (count == k) {
                return result;
            }
        }
        while (i < array1.length) {
            result = array1[i];
            i++;
            count++;
            if (count == k) {
                return result;
            }
        }
        while (j < array2.length) {
            result = array2[j];
            j++;
            count++;
            if (count == k) {
                return result;
            }

        }
        return result;
    }

}// end
