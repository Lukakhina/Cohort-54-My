package leson24.flyers;

public abstract class Transport {
    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract void  tekePassenger();
    public int countPassenger() {
        return capacity;
    }
}
