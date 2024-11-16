package leson18.StaticMethod;

public class TestStatic {
    // non- static поле класса
    int x;

    //static поле класса
    static int staticY;

    // Статистический метод
    public void staticMethod(){
        // Статистические методы  видят только статистические члены ( поля и методы) класса:
        // х++; нет доступа к статистическому полю
        staticY++;
        // Может вызывать только статистические методы
        // nonStaticMethod();

        // Ключевое слово this не доступно в статистических методах
        // this.x

    }
    // не статистический метод
    public void nonStaticMethod() {
        // у не статистических методов есть доступ ко всем членам класса
        x++; // не статистика доступна
        staticY++; // статистика тоже доступна
        // Можем вызывать и не статические, и статистические методы класса
        staticMethod();
    }
    public static void setStaticMethod() {
        staticY++;
    }

    // Метод mein статистический. Имеет доступ только к статистическому контенту
    public static void main(String[] args) {
        // х = 10; Ошибка компиляции. у статик метода нет доступа к не статистической переменной
        TestStatic.setStaticMethod(); // может вызывать статик метод
        // nonStaticMethod();  не могут вызывать не статистический метод без создания объекта

        TestStatic testStatic = new TestStatic();
        // Я могу вызвать не статический метод, используя ссылку на объект
        testStatic.nonStaticMethod();

        int sum = MathUtil.sumOfIntegers(1,2, 5, 6, 7, 8);
        System.out.println("sum: " + sum);

        MathUtil.setCounter(10);

        System.out.println(MathUtil.getCounter());
    }

}
