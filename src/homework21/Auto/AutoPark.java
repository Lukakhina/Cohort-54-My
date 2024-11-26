package homework21.Auto;

import leson21.Autobus;
import leson21.BusDriver;
import leson21.Passenger;

public class AutoPark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("john", "LN-45844564");

        leson21.Autobus bus =  new leson21.Autobus(busDriver,15);

        System.out.println(bus.toString());

        BusDriver peter = new BusDriver("Peter", "LN-12348789");

        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n=============================\n");
        BusDriver margo = new BusDriver("Margo", "AE-123482251");
        leson21.Autobus bus1 = new Autobus(margo, 24);
        System.out.println(bus1.toString());
        bus1.installNewAutopilot("AP-gpt6");
        System.out.println(bus1.toString());
        margo.setName("Susana");
        System.out.println(bus1.toString());
        bus1 = null;
        System.out.println(margo.toString());
        System.out.println(bus.toString());
        bus.setDriver(margo);
        System.out.println(bus.toString());


        System.out.println("\n=============================\n");

        Passenger passenger = new Passenger("Alex");
        Passenger passenger1 = new Passenger("Max");
        Passenger passenger2= new Passenger("Alena");
        System.out.println(passenger.toString());
        System.out.println(passenger1.toString());
        System.out.println(passenger2.toString());

        // ПОсадка пассажиров
        bus.takePassenger(passenger);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger1);
        System.out.println("count pass: " + bus.getCountPassengers());
        bus.takePassenger(passenger2);
        System.out.println("count pass: " + bus.getCountPassengers());

        //Попытаемся повторно посадить пассажира
        System.out.println("==================================");
        bus.takePassenger(passenger);
        System.out.println("count pass: " + bus.getCountPassengers());

    }
}
