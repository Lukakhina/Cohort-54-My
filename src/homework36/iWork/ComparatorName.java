package homework36.iWork;


import java.util.Comparator;

public class ComparatorName implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        String name1 = sportsman1.getName();
        String name2 = sportsman2.getName();
        return name1.compareTo(name2);
    }
}
