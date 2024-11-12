package homework16;
/*
1. Добавлять в массив элементы (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы там есть) ++
4. Добавляем в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу get(int index) ??
7. Удалять элемент по индексу (Если индекс есть - удалит элемент - вернет удаленное значение) ++
8. Поиск элемента по значению indexOf(int value) (определить есть ли в массиве элемент с таким значением) ??
9. Удалять элемент по значению boolean removeByValue(int value)
(Если значение есть - удалит элемент - вернет true, если такое значение было) ++
 */


public class MeinMagicArray {
    int[] array;
    int cursor; // присвоено все поля по умолчанию -0

    public MeinMagicArray(){

        array = new int[10];
    }
    // Добавление в массив одного элемента
    void add(int value) {
        // Проверка. Есть ли свободное место во внутреннем массиве
        // Если места нет нужно добавить место
        if (cursor == array.length - 1) {
            // Курсор указывает на последнюю свободную ячейку
            // Рассширить массив перед добавлением нового элемента
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }
      // Динамическое расширение массива
      void expandArray() {
          System.out.println("Расширяем массив! cursor: " + cursor);
        /*
        1. Создание массива большого размера( в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

          // 1.
          int[]  newArray = new int[array.length * 2];
          // 2
          for (int i = 0; i < cursor; i++) {
              // Перепиши мне значение со старого массива от 0 до курсора
              newArray[i] = array[i];

          }
          // 3. Перебрасываем ссылку на новый массив
          array = newArray;
          System.out.println("Расширение массива завершено ");

    }


    void addAll(int... values) {
        // с values я могу обращаться точно также, как со ссылкой на массив int
       // System.out.println("Мы приняли несколько int-ов. А именно: " + values.length);
       // System.out.println("У каждого значения есть индекс. По индексом 0: " + values[0]);
        for (int i = 0; i < values.length; i++) {
            add(values[i]);

        }

    }
    // Текущее количество элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает строковое представление массива
    //  [100, 200, 500]
    public String toString(){
        /*
        Открыть скобочку .
        Перебрать элементы. Добавить каждый элемент, добавить запятую (если элемент не последний)
        закрыть скобочку
         */

        if (cursor == 0) return "[]";

        String resaut = "[";
        for (int i = 0; i < cursor; i++) {
            resaut = resaut + array[i] + ((i < cursor - 1) ? ", " : "]");

        }
        return resaut;
    }
}