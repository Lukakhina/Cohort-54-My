package homework36;

import java.util.Comparator;

public class ComparatorScore implements Comparator<Sportsman> {



    @Override
    public int compare(Sportsman S1, Sportsman S2) {
        return S1.getScore() - S2.getScore();
    }
}
