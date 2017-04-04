package A9;

import java.util.ArrayList;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        System.out.printf("%5s%10s%10s%10s\n", "N", "Bubble", "Selection", "Insertion");

        for (int x = 5; x <= 50; x += 5) {
        ArrayList<Patient> list1 = createRandomList(x * 1000);
        ArrayList<Patient> list2 = (ArrayList<Patient>) list1.clone();
        ArrayList<Patient> list3 = (ArrayList<Patient>) list1.clone();

        double time1, time2, time3;
        time1 = System.currentTimeMillis();
        Sorter.bubbleSort(list1);
        time1 = (System.currentTimeMillis() - time1) / 1000.0;

        time2 = System.currentTimeMillis();
        Sorter.selectionSort(list2);
        time2 = (System.currentTimeMillis() - time2) / 1000.0;

        time3 = System.currentTimeMillis();
        Sorter.insertionSort(list3);
        time3 = (System.currentTimeMillis() - time3) / 1000.0;

        System.out.printf("%5d%10.3f%10.3f%10.3f\n", x * 1000, time1, time2, time3);
        }
    }

    private static ArrayList<Patient> createRandomList(int length) {
        ArrayList<Patient> list = new ArrayList<>();
        Random rand = new Random();
        for (int x = 0; x < length; x++) {
            int order = rand.nextInt(length);
            list.add(new Patient(order, "Anonymous" + order, rand.nextBoolean()));
        }

        return list;
    }
}
