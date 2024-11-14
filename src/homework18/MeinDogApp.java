package homework18;

public class MeinDogApp {
    public static void main(String[] args) {
        DogHome Bin = new DogHome("Bin",100,10);
        DogHome Recs = new DogHome("Recs", 150, 20);
            Bin.jump();
            Bin.train();
            Bin.jumpBarrier(50);
            Bin.jumpBarrier(120);

        System.out.println("\n=========================\n");

            Recs.jump();
            Recs.train();
            Recs.jumpBarrier(50);
            Recs.jumpBarrier(70);


        ;
    }
}
