package leson24.flyers;
// Поддержка множественной реализации
// Класс может  реализовывать любое количество интерфейсов
// это нам позволяет частично обойти ограничения на множественное наследование
public class Duck  implements Flyable, Swiemmable{
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
