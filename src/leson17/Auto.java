package leson17;

public class Auto {

    void gas() {
        /*
        Происходят сложные действия,
        в результате которых автомобиль движется
         */

        // Изменили функционал! Дописали логику работы!

        System.out.println("Авто едет вперед!");
    }

    void breakMe() {
        /*
        Происходят сложные действия,
        в результате которых автомобиль замедляется
         */
        System.out.println("Авто замедляется");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.gas();

        auto.breakMe();

    }
}