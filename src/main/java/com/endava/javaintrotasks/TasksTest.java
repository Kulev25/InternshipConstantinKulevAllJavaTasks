package com.endava.javaintrotasks;

import org.junit.jupiter.api.Test;

import static com.endava.javaintrotasks.Tasks.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksTest {

    @Test
    void sumTest() {
        assertEquals(1, sum(1, 0));
        assertEquals(-1, sum(-1, 0));
        assertEquals(10, sum(6, 4));
        assertEquals(2, sum(1, 1));
        assertEquals(100, sum(45, 55));
    }

    @Test
    void factorialTest() {
        assertEquals(1, factorial(1));
        assertEquals(24, factorial(4));
        assertEquals(5040, factorial(7));
        assertEquals(3628800, factorial(10));
    }

    @Test
    void searchTest() {
        assertEquals(0, search(5, new Integer[]{5, 5, 5, 5, 5, 5}));
        assertEquals(5, search(6, new Integer[]{1, 2, 3, 4, 5, 6}));
        assertEquals(-1, search(9, new Integer[]{5, 5, 5, 5, 5, 5}));
        assertEquals(3, search(1, new Integer[]{5, 5, 5, 1, 5, 5}));
        assertEquals(-1, search(5, new Integer[]{}));
    }

    @Test
    void reverseTest() {
        assertEquals("", reverse(""));
        assertEquals("si eruliaf ,rehcaet tsetaerg ehT", reverse("The greatest teacher, failure is"));
    }

    @Test
    void maximumTest() {
        assertEquals(5, maximum(new Integer[]{5, 5, 5, 5, 5, 5}));
        assertEquals(6, maximum(new Integer[]{1, 2, 3, 4, 5, 6}));
        assertEquals(15, maximum(new Integer[]{6, 5, 0, -5, 15, 5}));
    }

    @Test
    void fizzBuzzTest() {
        assertEquals("Fizz", fizzBuzz(93));
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("47", fizzBuzz(47));
    }

    @Test
    void isPrimeTest() {
        assertEquals(true, isPrime(97));
        assertEquals(false, isPrime(15));
    }

    @Test
    void isPalindromeTest() {
        assertEquals(false, isPalindrome("qwerty3uiopoiuytrewq"));
        assertEquals(true, isPalindrome("qwertyytrewq"));
        assertEquals(true, isPalindrome("qwerty9ytrewq"));
    }

    @Test
    void getDuplicateCharactersTest() {
        assertArrayEquals(new char[]{'a'}, getDuplicateCharacters("Java"));
        assertArrayEquals(new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o'}, getDuplicateCharacters("qwertyuiopoiuytrewq"));
        assertArrayEquals(new char[]{}, getDuplicateCharacters(""));
        assertArrayEquals(new char[]{}, getDuplicateCharacters(null));
    }

    @Test
    void isSubstringTest() {
        assertEquals(true, isSubstring("Java", "a"));
        assertEquals(true, isSubstring("qwertyuiopoiuytrewq", "uyt"));
        assertEquals(false, isSubstring("Talk is cheap. Show me the code.", "edoc"));
        assertEquals(false, isSubstring("null", "word"));
    }

    @Test
    void searchAlgorithmTest() {
        assertEquals(-1, search(new int[]{}, 23));
        assertEquals(0, search(new int[]{23}, 23));
        assertEquals(1, search(new int[]{1, 2, 33, 56, 24}, 2));
        assertEquals(3, search(new int[]{8, 0, 2, 5, 7, -451}, 5));

    }

    @Test
    void sortTest() {
        assertArrayEquals(new int[]{}, sort());
        assertArrayEquals(new int[]{-11, -3, 9, 17, 42, 54, 54, 602, 999}, sort(42, 9, 17, 54, 602, -3, 54, 999, -11));
    }

}