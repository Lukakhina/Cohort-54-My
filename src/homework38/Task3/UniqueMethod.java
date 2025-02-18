package homework38.Task3;
/*
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e

 */

import java.util.SortedSet;

public class UniqueMethod {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }
    public static char getFirstUniqueChar(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (string.indexOf(chars[i]) == string.lastIndexOf(chars[i])) {
                return chars[i];
            }
        }
        return ' ';
    }




}
