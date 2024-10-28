package homework08;
/*
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class Homework080202 {
    public static void main(String[] args) {
        int I = 1;
        while (I < 11) {
            System.out.println("Task " + I++);
        }

    }
}
