package consultation;

import java.sql.Array;
import java.util.Arrays;

public class hotel4raum {

        public static void main(String[] args) {

            // Создаем отел из четырех номеров и устанавливаем количеств мест в каждом номере: 2,3,1,4
            int[] hotel = {2, 3, 1, 4};

            // Количество номеров в отеле
            int quantityNumbers = hotel.length;
            // Общее количество мест в номерах отеля (сумма мест)
            int sumPlaceOfNumbers = 0;

            for (int i = 0; i < quantityNumbers; i++) {
                System.out.println("Количество мест в номере [" + i + "]: " + hotel[i]);
                // Суммируем количество мест в номерах отеля
                sumPlaceOfNumbers = sumPlaceOfNumbers + hotel[i];
            }
            System.out.println("===============================");
            System.out.println("Общее количество номеров в отеле: " + quantityNumbers);
            System.out.println("Общее количество мест в отеле: " + sumPlaceOfNumbers);
            System.out.println();
            System.out.println();
            System.out.println("===============================");

            // Второй вариант - использовать метод из класса Arrays
            sumPlaceOfNumbers = Arrays.stream(hotel).sum();
            System.out.println("Второй вариант: ");
            System.out.println("Общее количество номеров в отеле: " + quantityNumbers);
            System.out.println("Общее количество мест в отеле: " + sumPlaceOfNumbers);
        }

}
