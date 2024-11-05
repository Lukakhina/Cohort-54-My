package homework15;

public class MeinStudent {
   public static void main(String[] args) {
      Profession student = new Profession(); //Создаем объект класса Profession




      System.out.println("\n================= Архитектор =================\n");
      Profession architect = new Profession( "Poma", "Architect", 20);
      architect.info();
      architect.study();


      System.out.println("\n================= Инженер =================\n");
      Profession engineer = new Profession( "Vasilii", "Engineer", 21);
      engineer.info();
      engineer.isSick();


      System.out.println("\n================= Зубной техник =================\n");
      Profession dentalTechnician = new Profession( "Darina", "Dental technician", 19);
      dentalTechnician.info();
      dentalTechnician.practice();

      System.out.println("\n================= Экономик =================\n");
      Profession economy = new Profession( "Anatolii", "Economy", 22);
      economy.info();
      economy.skips();







   }

}
