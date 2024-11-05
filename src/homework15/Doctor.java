package homework15;

public class Doctor {
    public static void main(String[] args) {
        Profession doctor = new Profession();


        System.out.println("\n================= Домашний врач =================\n");
        Profession familyDoctor = new Profession( "Oleg", "Architect", 35);
        familyDoctor.info();
        familyDoctor.vacation();


        System.out.println("\n================= Хирург =================\n");
        Profession surgeon = new Profession( "Vladimir", "Surgeon", 40);
        surgeon.info();
        surgeon.work();


        System.out.println("\n================= Онколог =================\n");
        Profession oncologist = new Profession( "Irina", "Oncologist", 37);
        oncologist.info();
        oncologist.work();



        System.out.println("\n================= Ревматолог =================\n");
        Profession rheumatologist = new Profession( "Galina", "Rheumatologist", 28);
        rheumatologist.info();
        rheumatologist.isSick();





    }
}
