package leson24.flyers;

public class Boot extends Transport implements  Swiemmable  {
    public Boot(int capacity) {
        super(capacity);
    }

    @Override
    public void swim() {
        System.out.println("Boot Swimming");
    }

    @Override
    void tekePassenger() {
        System.out.println("Boat take passenger");
        capacity++;
    }
}
