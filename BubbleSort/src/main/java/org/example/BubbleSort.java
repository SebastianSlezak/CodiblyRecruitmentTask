package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BubbleSort {
    boolean sorted = false;

    public Object sort(List<Integer> list) {
        Integer temp;

        try {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                        sorted = false;
                    }
                }
            }
            return list;
        } catch (RuntimeException e) {
            return new RuntimeException("RuntimeException").getMessage();
        }
    }

    public Object sort(ArrayList<Double> list) {
        Double temp;

        if (list.stream().anyMatch(Objects::nonNull)) {
            list.removeIf(Objects::isNull);
        } else {
            return new RuntimeException("RuntimeException").getMessage();
        }
        try {
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                        sorted = false;
                    }
                }
            }
            return list;
        } catch (RuntimeException e) {
            return new RuntimeException("RuntimeException").getMessage();
        }
    }
}