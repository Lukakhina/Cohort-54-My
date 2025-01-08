package homework22.Animals22;

public class Hamsster extends Animal {

    @Override
    public void voice() {
        System.out.println(" Hamster voice Hrum-hrum");

    }

    @Override
    public String toString() {
        return super.toString() + " Hamster. Дополнение реализации родительского метода ";
    }
}
