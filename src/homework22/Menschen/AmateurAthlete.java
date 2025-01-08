package homework22.Menschen;

public class AmateurAthlete extends Person{
    @Override
    public void run() {
        System.out.println("Running at 15 km/h");
        rest(10);
    }
}
