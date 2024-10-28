package consultation;

import java.util.Arrays;

public class hotel4raum1 {
    public static void main(String[] args) {
        // создаем отель из четырех номеров и устанавливаем количество мест в каждом номере 2,3,1,4
        int[] hotel = {2,3,1,4};

        //Количество номеров в отеле
        int  quantityNumbers = hotel.length;
        // Общее количество в номерах отеля (сумма мест)
        // Начинается с нулевой ячейки
        int sumPlaceOfNumbers = 0;

        for (int i = 0; i < quantityNumbers; i++) {
            //вместо него ставит переменную по счетчику
            System.out.println("Количество мест в номере [" + i + "]: " + hotel[i]);
            //Суммируем количество мест в номерах отеля
            // мы в этой формуле показываем что
            sumPlaceOfNumbers = sumPlaceOfNumbers + hotel[i];

        }
        System.out.println("=======================================");
        System.out.println("Общее количество номеров в отеле : " + quantityNumbers);
        System.out.println("Общее количество мест в отеле : " + sumPlaceOfNumbers);
        System.out.println("=========================================");


        // Второй вариант - использовать метод из класса Arrays
        sumPlaceOfNumbers = Arrays.stream(hotel).sum();
        System.out.println("Второй вариант: " );
        System.out.println("Общее количество номеров в отеле : " + quantityNumbers);
        System.out.println("Общее количество мест в отеле : " + sumPlaceOfNumbers);


    }


}
