package leson25.Box;

public class Wrappers {
    public static void main(String[] args) {
        //Классы-обертки используются в java для  предоставления
        // примитивных данных как объектов(ссылочных типов данных)
        /*
        Byte - обертка для byte - байт
        Short -  обертка для short - короткий
        Integer - обертка для  int - целое число
        Long - обертка для  long - длинный
        Double - обертка для  double - двойной
        Float -  обертка для float - плавать
        Character - обертка для  char - характер
        Boolean -  обертка для boolean - определение
         */

        // Автоматическое приведение типов
        // Авто упаковка и авто распаковка
        Integer wrapperInt = 5;// Авто упаковка примитива int в ссылочный Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Авто распаковка Integer автоматически преобразовало значение в примитив int
        System.out.println(primitiveInt);
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        System.out.println(Integer.MAX_VALUE);

        // Особенности сравнение классов-оберток
        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127 :" + (a == b)); // true
        System.out.println(127 + "equals(" + 127 + ") : " + a.equals(b));//true

        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128 : " + (c == d));//false
        System.out.println(128 + "equals(" + 128 + ") : " + c.equals(d));//true

        Integer c1 = - 128;
        Integer d1 = - 128;
        System.out.println("- 128 == - 128 : " +(c1 + d1)); // true
        // Все числа в этом диапазоне - 128 до 127 используется кеширование объектов

        // Для гарантированного правильного сравнения оберточных типов
        // нужно использовать equals()

        //
        String str1 = "Hello";
        String str3 = "Hello";
        System.out.println("str1 == str3: " + (str1 == str3));

        System.out.println("\n===========================\n");
        // Общие (или схожие) методы, которыми обладают классы обертки
        // 1. valueOf() -Упаковка. преобразует строку или приметив в соответствующий объект класса обвертки
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println(e == f);// создается один и тот же объект // true

        Double dbl = Double.valueOf(154.5);
        System.out.println(dbl + 1);

        // 2. parseXXX() - преобразует строку в соответсвующий примитив
        int intParse = Integer.parseInt("456") + 100;
        double d2 = Double.parseDouble("344.56");
        System.out.println(d2 + 200);

       // System.out.println(Integer.parseInt("Rjjj"));// если не получится извлечь значение - будет выброшено исключение(ошибка)
        //System.out.println(Integer.valueOf("Rjjj"));// если не получится извлечь значение - будет выброшено исключение(ошибка)
        // 3. toString() - возвращает строковое представление значения
        String strNumber = dbl.toString();
        System.out.println(strNumber + 10);//154.510 - конкатенация строк, а не операция сложения
        //4.  equals - сравнивает два объекта по значению
        //5. xxxValue()  Распаковка. Возвращает значение объекта как примитивный тип
        Double dbl2 = Double.valueOf(125.67);//Явная / принудительная упаковка
        double dPrimitive = dbl2.doubleValue(); // Явна / принудительная распаковка

        // Все числовые обертки наследуются от абстрактного класса Number
        // Byte, Short, Integer, Long, Double, Float

        /*
        byteValue();
        shortValue();
        intValue();
        longValue();
        floatValue();
        doubleValue();
         */
        Integer integer = 31844;
        System.out.println(integer.doubleValue());
        short sh = integer.shortValue();
        System.out.println(sh);

        double sum = add(14422233, 554.55);
        System.out.println(sum);

        Integer a1 = Integer.MAX_VALUE;


    }
    public static double add (Number number1, Number number2) {

        double d1 = number1.doubleValue();
        double d2 = number2.doubleValue();
        return d1 + d2;
    }
}
