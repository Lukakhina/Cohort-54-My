package consultation;

import java.util.Scanner;

public class TestArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество номеров: ");
        int rooms = scanner.nextInt();
        //счиватывает строчку с консоли
        scanner.nextLine();
        // создаем массив с полученніх данных c консоль и будут заполненных по умолчанию 0
        int[] array = new int[rooms];

        // цикличность
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите количество человек которые проживают в номере : ");
//            int peoples = scanner.nextInt();
//            scanner.nextLine();
//            array[i] = peoples;
//        }
        inputDataArray(0, array, scanner);

        System.out.println("==========================");

//        for (int i = 0; i < array.length; i++) {
//            // вывожу на экран номер комнаты и количество проживающих в них людей
//            // (i + 1) это считает с первой комнаты а не с нуля
//
//            System.out.println(" номер комнати " + (i + 1) + ": " + array[i]);
//        }
        peoplesRoom( 0, array, scanner);


        //проверяем возможно ли создать отель в два раза больше чем исходный
        if ((rooms * 2 ) > 1)  {
            int[] roomsNew1 = new int[rooms * 2];
            // создать код копирование количество проживающих в номерах
            for (int i = 0; i < array.length; i++) {
                roomsNew1[i] = array[i];
            }

            for (int i : roomsNew1) {   // for(int = 0; i < roomsNew1.length; i++)
                System.out.println(i + " ");
            }

            // Находим первый элемент массива после его середины
            int middle = roomsNew1.length / 2;
            if (roomsNew1.length % 2 > 0) {
                //  middle = rooms / 2 + 1;
                middle = middle +1;
            }

//            for (int i = middle; i  < roomsNew1.length; i++) {
//                System.out.println("Введите количество человек которые проживают в номере : ");
//                int peoples = scanner.nextInt();
//                scanner.nextLine();
//                roomsNew1[i] = peoples;
//            }
            inputDataArray(middle, roomsNew1, scanner);


            System.out.println("============================");
            for (int i = 0; i < roomsNew1.length; i++) {
                // System.out.println(i + " ");
                System.out.println(" номер комнати " + (i + 1) + ": " + roomsNew1[i]);
            }


        }
        System.out.println("============================");

        // проверяем возможно ли создать отель в два раза меньше чем исходный
        if ((rooms / 2 ) > 1) {
            int[] roomsNew = new int[rooms / 2];
            // создать код копирование количество проживающих в номерах
            for (int i = 0; i < array.length && i <roomsNew.length; i++) {
                roomsNew[i] = array[i];
            }

//            for (int i = 0; i < roomsNew.length; i++) {
//                //  System.out.println(i + " ");
//                System.out.println(" номер комнати " + (i + 1) + ": " + roomsNew[i]);
//            }
            peoplesRoom( 0,roomsNew, scanner);

        }
        System.out.println();

    }
    public static void inputDataArray(int counter, int[] arr, Scanner scanner) {
        for (int i = counter; i  < arr.length; i++) {
            // Выводим строку запроса для ввода и выводим номер комнаты (i)
            System.out.println("Введите количество человек которые проживают в номере [" + i + "]: ");
            int peoples = scanner.nextInt();
            scanner.nextLine();
            arr[i] = peoples;
        }
    }
    public static void peoplesRoom (int counter, int[] pip, Scanner scanner) {
        // домашнее задание: дописать код для вывода на консоль количества комнат(номеров) и проживающих в них человек
        //    public static void ...
        System.out.println("==========================");
        for (int i = counter; i < pip.length; i++) {
            // выводим на консоль количество номеров и проживающих
            System.out.println("Номер комнаты (array) " + (i + 1) + ": " + pip[i]);
           int array = scanner.nextInt();
           int roomsNew = scanner.nextInt();
           scanner.nextLine();
            int maxLength = Math.max(array, roomsNew);
            pip[i] = maxLength;

        }


//        int maxLength = Math.max(array.length, roomsNew.length);
//
//        for (int i = 0; i < maxLength; i++) {
//            if (i < array.length) {
//                System.out.println("Номер комнаты (array) " + (i + 1) + ": " + array[i]);
//            }
//            if (i < roomsNew.length) {
//                System.out.println("Номер комнаты (roomsNew) " + (i + 1) + ": " + roomsNew[i]);
//            }
//            pip[i] = maxLength;
//        }
    }
}





