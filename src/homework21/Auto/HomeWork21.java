package homework21.Auto;

import homework21.Auto.Auto.Autobus;
import homework21.Auto.Auto.BusDriver;
import homework21.Auto.Auto.Passenger;

public class HomeWork21 {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John", "HD-265525");

        Autobus bus = new Autobus(new BusDriver("Max", "LD-266585"),5);

        Passenger passenger = new Passenger("Tim");
        Passenger passenger1 = new Passenger("Hanna");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("John");
        Passenger passenger4 = new Passenger("Tom");
        Passenger passenger5 = new Passenger("Sebastian");
        Passenger passenger6 = new Passenger("Bob");

        String emptyPassengers =bus.getPassengerList();
        System.out.println("Empty passenger List: " + emptyPassengers);

        bus.takePassenger(passenger);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(passenger5);
        bus.takePassenger(passenger6);


        System.out.println("\n==============================\n");
        String passengerList = bus.getPassengerList();
        System.out.println(passengerList);

        // Высадим одного из пассажиров
        System.out.println("bus.dropPassenger(passenger)" + bus.dropPassenger(passenger));
        System.out.println("bus.getPassengerList()" + bus.getPassengerList());

        System.out.println("Еще раз высаживаем этого пассажира: " + bus.dropPassenger(passenger));
        System.out.println( bus.getPassengerList());
    }
}
