package homework15;
/*Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
*/

public class  Profession{

    String name;
    String profession;
    int age;


    public void study() {
        System.out.println("Учится");
    }
    public void isSick(){
        System.out.println("Болеет");
    }
    public void skips(){
        System.out.println("Прогуливает");
    }
    public void work(){
        System.out.println("Работает");
    }
    public void learn(){
        System.out.println("Учит");
    }
    public void treats(){
        System.out.println("Лечит");
    }
    public void practice(){
        System.out.println("Проходит практику");
    }
    public void vacation() {
        System.out.println("Находится в отпуску");
    }
    public Profession(String name, String profession,int age ) {
        this.name = name;
        this.profession = profession;
        this.age = age;

    }
    public Profession() {

    }
    public void info() {
        System.out.printf("Имя %s, Возраст: %d, Пофесия: %s\n", name, age, profession);
    }
}
