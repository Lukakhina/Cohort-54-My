package leson24.flyers;

public class FlyersApp {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(15);
        Flyable duck = new Duck();
        Swiemmable boat = new Boot(50);


        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();
            if (flyable instanceof Airplane) {
                // Casting
                Airplane airplane1 = (Airplane) flyable;
                airplane1.tekePassenger();
                System.out.println("Количество пассажиров на борту: " + airplane1.countPassenger());
            }

        }
        // самолет полетел, лодка поплыла
        System.out.println("\n=============================\n");
        Transport[] transports = {airplane, (Transport) boat};
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            transport.tekePassenger();
            if (transport instanceof Flyable) {
                Flyable flyable = (Flyable) transport;
                flyable.fly();
            }
            if (transport instanceof Swiemmable) {
                Swiemmable swiemmable = (Swiemmable) transport;
                swiemmable.swim();
            }

        }
    }
}
