package homework11;

import java.util.Arrays;

public class Task4 {
    public static int[] removeElement(int[] array, int element) {
        return Arrays.stream(array)
                .filter(e -> e != element)
        .toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 5, 3};
        int elementToRemove = 3;
        int [] newArray = removeElement(array, elementToRemove);
        System.out.println(Arrays.toString(newArray));
    }
}
