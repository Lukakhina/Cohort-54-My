package leson24.flyers;

public class Airplane extends Transport implements  Flyable {

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    void tekePassenger() {
        System.out.println("Airplane take Passenger");
        capacity++;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }


}
