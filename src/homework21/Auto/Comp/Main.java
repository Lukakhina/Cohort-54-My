package homework21.Auto.Comp;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Acer", "KL -700K");
        Memory memory = new Memory("Apple", "ZV-16GB");
        Storage storage = new Storage("Samsung", " EVO-25G ");

        Computer computer = new Computer(processor, memory, storage);

        System.out.println("Processor: " + computer.getProcessor().getBrand() + " " + computer.getProcessor().getModel());
        System.out.println("Memory: " + computer.getMemory().getBrand() + " " + computer.getMemory().getModel());
        System.out.println("Storage: " + computer.getStorage().getBrand() + " " + computer.getStorage().getModel());

    }
}
