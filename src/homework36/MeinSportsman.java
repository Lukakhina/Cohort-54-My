package homework36;

import java.util.Arrays;
import java.util.Comparator;

public class MeinSportsman {
    public static void main(String[] args) {


        Sportsman[] Sportsman = new Sportsman[4];
        Sportsman[0] = new Sportsman("John", 25, 100);
        Sportsman[1] = new Sportsman("Mike", 30, 150);
        Sportsman[2] = new Sportsman("Tom", 20, 50);
        Sportsman[3] = new Sportsman("Albert", 35, 200);

        System.out.println("++++++++++++ Сортировка по  возрасту +++++++++++++++\n");
        System.out.println(Arrays.toString(Sportsman));
        Arrays.sort(Sportsman);
        System.out.println();


        System.out.println("+++++++++++++ Сортировка по имени ++++++++++++++\n");
        Arrays.sort(Sportsman, new ComparatorName());
        System.out.println(Arrays.toString(Sportsman));

        System.out.println("+++++++++++++ Сортировка по рейтингу ++++++++++++++++++\n");
        Arrays.sort(Sportsman, new ComparatorScore());
        System.out.println(Arrays.toString(Sportsman));

        System.out.println("++++++++++++ Анонимный +++++++++++++++\n");
        Arrays.sort(Sportsman, new Comparator<homework36.Sportsman>() {
            @Override
            public int compare(homework36.Sportsman sportsman1, homework36.Sportsman sportsman2) {
                return sportsman1.getName().compareTo(sportsman2.getName());
            }
        });
      //  Arrays.sort(Sportsman, new Comparator<homework36.Sportsman>() {
      //      @Override
      //      public int compare(homework36.Sportsman sportsman1, homework36.Sportsman sportsman2) {
     //      return sportsman2.getName() - sportsman1.getName();
     //       }

    //    });
        System.out.println(Arrays.toString(Sportsman));







    }
}
