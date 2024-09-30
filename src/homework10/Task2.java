package homework10;

public class Task2 {
    public static void main(String[] args) {
        String[] inputStrings = {"apple", "banana", "cherry", "date", "fig"};

        // Вызываем метод, который вернет массив с самой короткой и самой длинной строкой
        String[] result = getShortestAndLongestStrings(inputStrings);

        // Выводим результат
        System.out.println("Самая короткая строка: " + result[0]);
        System.out.println("Самая длинная строка: " + result[1]);
    }

    // Метод для получения самой короткой и самой длинной строки
    public static String[] getShortestAndLongestStrings(String[] arr) {
        if (arr == null || arr.length == 0) {
            return new String[0]; // Возвращаем пустой массив, если входной массив пуст
        }

        String shortest = arr[0];
        String longest = arr[0];

        for (String str : arr) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return new String[]{shortest, longest};

    }
}
