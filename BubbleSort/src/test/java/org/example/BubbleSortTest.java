package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void test1() {
        ArrayList<Comparable> list = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, 3, 8));
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 8, 8));
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test2() {
        ArrayList<Comparable> list = new ArrayList<>(Arrays.asList(-9,3,0,2,2,4,0,1,5,9));
        List<Integer> result = new ArrayList<>(Arrays.asList(-9, 0, 0, 1, 2, 2, 3, 4, 5, 9));
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test3() {
        ArrayList<Comparable> list = new ArrayList<>(Arrays.asList());
        List<Integer> result = new ArrayList<>(Arrays.asList());
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test4() {
        ArrayList<Comparable> list = new ArrayList<>(Arrays.asList(null,5.0001));
        ArrayList<Comparable> result = new ArrayList<>(List.of(5.0001));
        var bubbleSort = new BubbleSort();
        assertEquals(result, bubbleSort.sort(list));
    }

    @Test
    void test5() {
        var bubbleSort = new BubbleSort();
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(null));
    }
}