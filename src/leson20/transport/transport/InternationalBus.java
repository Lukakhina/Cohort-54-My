package leson20.transport.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 19.11.2024
 */

public class InternationalBus {

    private String[] countries;

    public InternationalBus(String model, int year, int capacity, String[] countries) {
       // super(model, year, capacity);
        this.countries = countries;
    }

    public void goToRoute() {
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Посещаю страну: " + countries[i]);
        }
    }
}