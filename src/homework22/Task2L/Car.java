package homework22.Task2L;

public class Car extends Vehicle{
    public Car(Engine engine) {
        super();
        setEngine(engine);
    }

    @Override
    public void startEngine() {
        this.getEngine().start();
    }
}
