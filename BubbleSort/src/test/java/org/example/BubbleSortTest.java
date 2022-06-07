package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void test1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, 3, 8));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 8, 8));
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-9,3,0,2,2,4,0,1,5,9));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(-9, 0, 0, 1, 2, 2, 3, 4, 5, 9));
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test3() {
        ArrayList<Integer> list = new ArrayList<>(List.of());
        ArrayList<Integer> result = new ArrayList<>(List.of());
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test4() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(null,5.0001));
        ArrayList<Double> result = new ArrayList<>(List.of(5.0001));
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test5() {
        var bubbleSort = new BubbleSort();
        assertEquals("RuntimeException", bubbleSort.sort((List<Integer>) null));
    }
}