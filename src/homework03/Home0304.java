package homework03;
/*
Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?


 */

public class Home0304 {
    public static void main(String[] args) {
        int t1 = 25;
        int t2 = 28;
        int t3 = 22;
        int t4 = 21;
        int t5 = 26;
        int t6 = 20;
        int t7 = 18;

        int days = 7;
        // сумма всех значений деленая на их количество
        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7 ;
        System.out.println("sumTemp: " + sumTemp);
        // x / 7 -> средняя температура
        // 141 / 7 -> 20.14..
        // double averageTemp = sumTem / days;
        // Обрезается дробная часть  в операции деление
        double averageTemp = sumTemp / (double) days;
        System.out.println("averageTemp: " + averageTemp);


    }
}
