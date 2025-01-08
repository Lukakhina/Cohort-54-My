package homework22.Menschen;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.run();

        AmateurAthlete amateur = new AmateurAthlete();
        amateur.run();

        ProfessionalAthlete professional = new ProfessionalAthlete();
        professional.run();
    }
}
