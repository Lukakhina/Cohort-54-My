package homework15;

public class Teacher {
    public static void main(String[] args) {
        Profession teacher = new Profession();


        System.out.println("\n================= Mатематик =================\n");
        Profession mathematician = new Profession( "Arina", "Mathematician", 29);
        mathematician.info();
        mathematician.learn();


        System.out.println("\n================= Химия =================\n");
        Profession chemist = new Profession( "Dmitrii", "Chemist", 49);
        chemist.info();
        chemist.isSick();

        System.out.println("\n================= Биология =================\n");
        Profession biology = new Profession( "Aleksei", "Biology", 42);
        biology.info();
        biology.vacation();




    }
}
