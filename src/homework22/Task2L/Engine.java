package homework22.Task2L;

public class Engine {
    private int power;
    private final String type;

    private boolean isStarted;

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }



    public void  start() {
        // Проверить запущен ли двигатель
        // если нет значит запустим
        if (isStarted) {
            System.out.println("Двигатель уже работает ");
        }else {
            isStarted = true;
            System.out.println("Запускаем двигатель ");
        }

    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", isStarted=" + isStarted +
                '}';
    }
}
