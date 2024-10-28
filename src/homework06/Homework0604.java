package homework06;
/*
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
Copy
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.

*2024

AIT-TR
 */

public class Homework0604 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
        /*
        result = (a + b) > 10, будет верно так как ( 11 > 10) будет True,
        result = (a - b) == 5; будет верно так как ( 8 - 3 ) = 5; будет True,
        result = (a * b) != 24; будет неверно так как
        ( 8 * 3) = 24 , а 24 != 24 будет false;
        result = (a / b) >= 2; будет верно так как ( 8/3)= 2,66 по єтому (2,66 >=2)
       этому значение будет  True;
        */
    }
}
