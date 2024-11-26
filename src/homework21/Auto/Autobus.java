package homework21.Auto;

/*

Ассоциация - это связь, при которой один объект связан с другим объектом.
Это найболее общая форма связи.

Агрегация - это более специфическая форма ассоциации, представляющая собой отношение "часть целое"
Где часть может существовать независимо от целого

Композиция - это более жесткая форма агрегации, где часть не может существовать без целого
Если целое уничтожается, часть также уничтожается.

Для создания HAS_A связи типа мы определяем поле класса,
которое будет хранить ссылку на объект другого класса.

Ассоциация (в том числе Агрегация и Композиция)
реализуется через создание ссылок на другие объекты внутри класса.
Отношение,где один класс использует другой класс в качестве одного из полей.
Класс содержит поле, который ссылается на объекты другого класса.
Важные аспекты ассоциации
Направленность связи: Однонаправленности и двунаправленная
Кардиональность связи. Определяется, сколько объектов одного класса может быть ассоциировано с объектом другого класса
One-to-one (один к одному), Оne-to Many (один ко многим), Many-to-Many (многие ко многим)
1 : 1
Автобус и Двигатель.
Каждый автобус будет иметь ровно один двигатель.
И на каждый двигатель приходится ровно один автобус

1 : Many
Автобус и список пассажиров
Один автобус может перевозить множество пассажиров
Каждый пассажир находится в одном автобусе

Many : Many
Список автобусов и список автобусных остановок
Каждый автобус останавливается на множестве остановок
И каждая остановка может обслужить множество автобусов
 */




public class Autobus {
    private static int counter;
    private final int id;

    //  Поля, хранящее ссылки на объекты BusDriver и Autopilot
    private BusDriver driver;//Агрегация (мягкая связь)
    private Autopilot autopilot; //композиция (жесткая не разрывная связь)

    private final int capaciti;
    private int countPassengers;

    // Список пассажиров. Агрегация. Однонаправленная. 1 : Many.  В одном автобусе множество пассажиров
    private final Passenger[] passengers;

    public Autobus(BusDriver busDriver, int capaciti) {
        this.id = counter++;
        this.driver = busDriver;
        this.capaciti = capaciti;
        // Часть (объекта автопилота) создается при создании целого (объекта автобуса)
        this.autopilot = new Autopilot("AP-v001");
        //Реализуем двунаправленность связи
        //this.autopilot.setAutobus(this);//Передаю ссылку на этот автобус
        this.passengers = new Passenger[capaciti];//null
    }
    public
    boolean takePassenger(Passenger passenger) {
        /*
         Надо проверить:
        1. Есть ли свободное место
        2. Находится ли этот пассажир уже в автобусе
        3. Если проверка пройдена - садим на борт
           3.1. Добавляем его в список пассажиров
           3.2. Увеличиваем и возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */
        if (countPassengers < capaciti) {
            // Место есть
            // Надо проверять, есть ли такой пассажир в автобусе
            // Декомпозиция
            if (isPassengerInBus(passenger)) {
                // Такой пассажир есть в списке
                System.out.printf("Пассажир id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }
            //Садим на борт
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
            return true;
        }
        // Свободного места нет
        System.out.printf("В автобусе id: %d свободных мест нет!\n",this.id);
        return  false;
    }
    //TODO написать метод высадки пассажира из автобуса
    /*
    Проверить есть ли пассажир в автобусе.
    Убрать его из списка пассажиров
    [ 1, 2, 6, 78, 99] ->  убрать с id 6 [1, 2, 78, 99]
    Уменьшить количество пассажиров
     */

    private boolean isPassengerInBus(Passenger passenger) {

        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }

        }
        // Пассажир с таким id нет в нашем массиве пассажира с таким id
        return false;
    }

    // Объект автобуса будет управлять автопилотом
    public void updateAutopilotVersion(String softwareVersion){
        this.autopilot.setSoftwareVersion(softwareVersion);
    }
    public void installNewAutopilot(String softwareVersion) {
        //все никто никуда не ссылается
        //this.autopilot.setAutobus(null);
        // Следить за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot = new Autopilot(softwareVersion);
       // this.autopilot.setAutobus(this);

    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id +", capaciti=" + capaciti +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                '}';
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        //если даже это мьгкая связь нам нужно с обоих сторон на ссылки смотреть
       // this.driver.setAutobus(null);
        this.driver = driver;
       // this.driver.setAutoBus(this);
    }

    public int getId() {
        return id;
    }

    public int getCapaciti() {
        return capaciti;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}