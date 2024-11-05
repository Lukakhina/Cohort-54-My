package homework15;
/*Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
*/

public class PeopleMenschen {
    String nameVorname;
    String professionBeruf;
    int ageAlter;

    public void workArbeiten() {
        System.out.println("Работает");
    }
    public void restingAusruhen() {
       System.out.println("отдыхает");
   }
   public void skipVersäumen() {
       System.out.println("Прогуливает");
   }
   public void isSickKrank() {
       System.out.println("Болеет");
   }
   public PeopleMenschen(String menschName, String menschWork, int menschAge) {

       this.nameVorname = menschName;
       this.professionBeruf = menschWork;
       this.ageAlter = menschAge;

   }
   public PeopleMenschen() {

   }
   public void info() {
       System.out.printf("Имя %s, Возраст: %d, Пофесия: %s\n", nameVorname, ageAlter, professionBeruf);
   }


}
