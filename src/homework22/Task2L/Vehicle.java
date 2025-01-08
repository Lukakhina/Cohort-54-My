package homework22.Task2L;
/* абстрактный клас - используется для написание классов,
не предназначенных для создание объектов этого класса
 */

public abstract class Vehicle {
    private Engine engine;
    // Абстрактный метод - это метод без реализации
    // Только объявление метода (без тела)
    // Предназначен для переопределения в подклассах (наследниках)
    public abstract void startEngine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
