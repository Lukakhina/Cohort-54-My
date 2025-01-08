package homework21.Auto.Auto.Lehrer;
/*
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами.
 Компоненты Processor и Memory не могу существовать без компьютера. // Композиция - часть не может существовать без целого
 Часть создается вместе с целым
 */

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor; // Жесткая связь - композиция
        this.memory = memory;
        this.storage = storage; //Мягкая связь - агрегация
    }

    public Computer(Storage storage, String procBrand, String procModel) {
        this.storage = storage;
        this.processor = new Processor(procBrand, procModel);
        this.memory = new Memory("Crutial", "FGHJ-225");

    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
