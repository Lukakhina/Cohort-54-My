package homework24.TaskL1;
/*
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Task1App {
    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete();
        triathlete.run();
        triathlete.swim();

        if (triathlete instanceof Swimmer){
            Swimmer swimmer = (Swimmer) triathlete;
            swimmer.swim();
        }

        Swimmer athlete = new Triathlete();
        athlete.swim();

        if (athlete instanceof Runner) {
            Runner runner = (Runner) athlete;
            runner.run();
        }
    }
}
