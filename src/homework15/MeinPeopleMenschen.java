package homework15;

public class MeinPeopleMenschen {
    public static void main(String[] args) {

        PeopleMenschen peopleMenschen = new PeopleMenschen();

        peopleMenschen.isSickKrank();
        peopleMenschen.skipVersäumen();
        peopleMenschen.restingAusruhen();
        peopleMenschen.workArbeiten();

        String  menschName = peopleMenschen.nameVorname;
        System.out.println("Имя: "+ menschName);

        int menschAge = peopleMenschen.ageAlter;
        System.out.println("Возраст: " + menschAge);

        String menschWork = peopleMenschen.professionBeruf;
        System.out.println("Професия: " + menschWork);


        System.out.println("\n?============ Студент ============\n");
        PeopleMenschen student = new PeopleMenschen("Poma", "student",18  );
        System.out.println("Имя: " + student.nameVorname);
        System.out.println("Професия: " + student.professionBeruf);
        System.out.println("Возраст: " + student.ageAlter);
        student.skipVersäumen();


        System.out.println("\n============== Преподаватель =============\n");
        PeopleMenschen teacher = new PeopleMenschen("Boris", "teacher",40);
        System.out.println("Имя: " + teacher.nameVorname);
        System.out.println("Професия: " + teacher.professionBeruf);
        System.out.println("Возраст: " + teacher.ageAlter);
        teacher.workArbeiten();


        System.out.println("\n============== Врач =============\n");
        PeopleMenschen doktor = new PeopleMenschen("Bladimir", "dokt",38);
        System.out.println("Имя: " + doktor.nameVorname);
        System.out.println("Професия: " + doktor.professionBeruf);
        System.out.println("Возраст: " + doktor.ageAlter);
        doktor.restingAusruhen();


        System.out.println("\n============== Ребенок =============\n");
        PeopleMenschen child = new PeopleMenschen("Masha", "schoolgil",8);
        System.out.println("Имя: " + child.nameVorname);
        System.out.println("Професия: " + child.professionBeruf);
        System.out.println("Возраст: " + child.ageAlter);
        child.isSickKrank();

        System.out.println("====================================");
        child.info();








    }
}
