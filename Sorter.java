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
                if (tempNum > 0) {
                    Patient tempP = list.get(x);
                    list.set(x, list.get(x + 1));
                    list.set(x + 1, tempP);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void bubbleSort(ArrayList<Patient> list, Comparator<Patient> comparator) {
        PatientComparator compare = new PatientComparator();
        boolean swapped;
        int tempNum;
        do {
            swapped = false;
            for (int x = 0; x < list.size() - 1; x++) {
                tempNum = compare.compare(list.get(x), list.get(x + 1));
                if (tempNum > 0) {
                    Patient tempP = list.get(x);
                    list.set(x, list.get(x + 1));
                    list.set(x + 1, tempP);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void selectionSort(ArrayList<Patient> list) {

    }

    public static void insertionSort(ArrayList<Patient> list) {
        for (int x = 1; x < list.size(); x++) {
            Patient item = list.get(x);
            int pos;
            for (pos = x; pos > 0 && list.get(pos - 1).compareTo(item) > 0; pos--) ;
            list.add(pos, list.remove(x));
        }
    }
}
