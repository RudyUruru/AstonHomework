package org.example.collection;

import java.util.Comparator;

public class MyCollections {

    public static <E> void bubbleSort(MyList<E> list, Comparator<? super E> comparator) {
        boolean swapped;
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    E buff = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buff);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

}
