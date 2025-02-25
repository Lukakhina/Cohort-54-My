package homework38.Task3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class HWL3 {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }
    private static Character getFirstUniqueChar(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char ch : string.toCharArray()) {
            if (uniqueChars.add(ch)) {
                uniqueChars.remove(ch);
            } else {
                uniqueChars.add(ch);
            }
        }
        System.out.println(uniqueChars);
       // return new ArrayList<>(uniqueChars).get(0);// Достучатся к элементам по индексу
        //return uniqueChars.toArray(new Character[0])[0]; // Достучатся к элементам по индексу
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next(); // Достучатся к элементам по индексу
    }


}
