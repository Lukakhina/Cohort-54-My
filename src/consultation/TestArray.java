package consultation;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество номеров: ");
        int rooms = scanner.nextInt();
        //счиватывает строчку с консоли
        scanner.nextLine();
        // создаем массив с полученніх данных c консоль и будут заполненных по умолчанию 0
        int[] array = new int[rooms];

        // цикличность
        //for (int i = 0; i < array.length; i++) {
        //   System.out.println("Введите количество человек которые проживают в номере : ");
        //   int peoples = scanner.nextInt();
        //    scanner.nextLine();
        //    array[i] = peoples;
        //}
        inputDataArray(0, array, scanner);


        System.out.println("==========================");
        for (int i = 0; i < array.length; i++) {
            // вывожу на экран номер комнаты и количество проживающих в них людей
            // (i + 1) это считает с первой комнаты а не с нуля

            System.out.println(" номер комнати " + (i + 1) + ": " + array[i]);

        }
        //проверяем возможно ли создать отель в два раза больше чем исходный
        if ((rooms * 2) > 1) {
            int[] roomsNew1 = new int[rooms * 2];
            // создать код копирование количество проживающих в номерах
            for (int i = 0; i < array.length; i++) {
                roomsNew1[i] = array[i];


            }

            for (int i : roomsNew1) { //for(int = 0; i < roomNew1.length; i++)
                System.out.println(i + " ");
            }
            // Находим первый элемент массива после его средины
            int middle = rooms / 2;
            if (rooms % 2 > 0) {
                //  middle = rooms / 2 + 1;
                middle = middle + 1;

            }
            // Находим первый элемент массива после середины
            int middle = roomsNew1.length/2;
            if (roomsNew1.length % 2 > 0) {
               // middle = rooms / 2 + 1;
                middle = middle + 1;


            }
            System.out.println("============================");
            //  for (int i : roomsNew1) {} // сокращение  формулы for
            // System.out.println(i + " ");
            for (int i = 0; i < roomsNew1.length; i++) {
                // System.out.println(i + "");
                System.out.println(" номер комнати " + (i + 1) + ": " + roomsNew1[i]);

            }
            System.out.println("=============================");
            //for (int i = middle; i  < roomsNew1.length; i++) {
            //  System.out.println("Введите количество человек которые проживают в номере : ");
            //int peoples = scanner.nextInt();
            //   scanner.nextLine();
            //  roomsNew1[i] = peoples;
            //}

            inputDataArray(middle,roomsNew1,scanner);


        }



        // проверяем возможно ли создать отель в два раза меньше чем исходный
        if ((rooms / 2) > 1) {
            int[] roomsNew = new int[rooms / 2];
            // создать код копирование количество проживающих в номерах
            for (int i = 0; i < array.length && i < roomsNew.length; i++) {
                roomsNew[i] = array[i];

            }
            for (int i = 0; i < roomsNew.length; i++) {
                //  System.out.println(i + " ");
                System.out.println(" номер комнати " + (i + 1) + ": " + roomsNew[i]);
            }


        }
        System.out.println();


    }

    public static void inputDataArray(int counter, int[] arr, Scanner scanner) {
        for (int i = counter; i < arr.length; i++) {
            //выводим строку запроса для ввода и выводим номер комнаты (i)
            System.out.println("Ведите количество человек которые проживают в номере [" + i + "]: ");
            int peoples = scanner.nextLine();
            scanner.nextLine();
            arr[i] = peoples;

        }

    }
    // Домашнее задание: дописать код для вывода на консоль
    // количества комнат проживающих в них человек
    public static void peopelsRoom (int) {

        for (int i = 0; i < array.length; i++) {
            // вывожу на экран номер комнаты и количество проживающих в них людей
            // (i + 1) это считает с первой комнаты а не с нуля

            System.out.println(" номер комнати " + (i + 1) + ": " + array[i]);

        }

    }

}
