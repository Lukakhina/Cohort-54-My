package leson10;

public class ForLoopExample {
    public static void main(String[] args) {
        /*
        for (< Блок инициализации> ; <Блок проверок / условие выхода>; <Блок изменений> ) {
        // Тело цикла
        }
         */
        //Вывести  все числа  от 0 до 10
        int j = 0;
        while (j <= 10) {
            System.out.println(j + " ,");
            j++;
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            // Тело цікла
            System.out.println(i + ", ");

        }


    }


}

