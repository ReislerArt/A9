package A9;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter {
    public static void bubbleSort(ArrayList<Patient> list) {
        boolean swapped;
        int tempNum;
        do {
            swapped = false;
            for (int x = 0; x < list.size() - 1; x++) {
                tempNum = list.get(x).compareTo(list.get(x + 1));
                if (tempNum == -1) ;
                else if (tempNum == 1) {
                    Patient tempP = list.get(x);
                    list.set(x, list.get(x + 1));
                    list.set(x + 1, tempP);
                    swapped = true;
                } else {
                    // ??
                    System.out.println(tempNum);
                }
            }
        } while (swapped);
    }

    public static void bubbleSort(ArrayList<Patient> list, Comparator<Patient> comparator) {

    }

}
