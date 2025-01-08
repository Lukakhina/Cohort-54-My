package homework22.Task2L;

public class Motocycle extends Vehicle {
    public Motocycle(Engine engine) {
        super();
        setEngine(engine);

    }

    @Override
    public void startEngine() {
        System.out.println("Starting Motocycle");
        this.getEngine().start();

    }
}
