package homework27;
/*
Реализуйте Enum для определения четырех времен года с методами,
 возвращающими среднюю температуру для каждого времени года.
 */

public enum Season {
    WINTER(-5),
    SPRING(10),
    SUMMER(25),
    FALL(15);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " average temperature: " + season.getAverageTemperature() + "°C");
        }
    }
}