package homework10;
/*
Написать метод, принимающий на вход массив строк.
 Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

public class Task2__1 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallestString(strings);

    }
    public static String[] getArrayWithSmallestString(String[] strings) {
        String smallestString = strings[0];
        String maximumString = strings[0];

        for (int i = 0; i < strings.length; i++) {
            // if(max < arr[i])
            if (strings[i].length() < smallestString.length()) {
                smallestString = strings[i];

            }
            if (strings[i].length() > maximumString.length()) {
                maximumString = strings[i];
            }
        }
        return new String[] {smallestString, maximumString};
    }

}
