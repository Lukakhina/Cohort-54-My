package homework22.Menschen;

public class ProfessionalAthlete extends Person{

    @Override
    public void run() {
        System.out.println("Running at 25 km/h");
        rest(5);
    }
}
