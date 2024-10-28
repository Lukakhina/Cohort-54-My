package homework09;
/*
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
 */

public class Task4 {
    public static void main(String[] args) {


        for (int I = 0; I < 7; I++) {
            for (int K = 0; K < 7; K++){
                System.out.println( K+ " ");
                if (I == K){
                    break;
                }
            }
            System.out.println();

        }

    }
}
