package homework22.Menschen;

public class Person {
    public void run() {
        System.out.println("Running at 10 km/h");
        rest(15);
    }

    public void rest(int minutes) {
        System.out.println("Needs rest for " + minutes + " minutes");
    }
}

