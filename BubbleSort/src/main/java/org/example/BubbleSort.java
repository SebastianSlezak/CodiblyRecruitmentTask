package org.example;

import java.util.*;

public class BubbleSort {
    boolean sorted = false;

    public ArrayList<Comparable> sort(ArrayList<Comparable> list) {

        try {
            list.removeIf(Objects::isNull);

            while (!sorted) {
                sorted = true;
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                        Collections.swap(list, i, i + 1);
                        sorted = false;
                    }
                }
            }
            return list;
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }
}