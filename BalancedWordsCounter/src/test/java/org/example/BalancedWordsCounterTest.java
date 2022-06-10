package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    @Test
    void test1() {
        String input = "aabbcbcccbaa";
        var balancedWordsCounter = new BalancedWordsCounter();
        assertEquals(28, balancedWordsCounter.count(input));
    }

    @Test
    void test2() {
        String input = "";
        var balancedWordsCounter = new BalancedWordsCounter();
        assertEquals(0, balancedWordsCounter.count(input));
    }

    @Test
    void test3() {
        String input = "abababa1";
        var balancedWordsCounter = new BalancedWordsCounter();
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(input));
    }

    @Test
    void test4() {
        var balancedWordsCounter = new BalancedWordsCounter();
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(null));
    }
}