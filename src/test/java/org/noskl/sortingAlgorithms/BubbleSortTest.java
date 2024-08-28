package org.noskl.sortingAlgorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 480 elements (even size)")
    void randomArray480() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(480).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BubbleSort.sort(arr);
        assertArrayEquals(sortedArray, arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 485 elements (odd size)")
    void randomArray485() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(485).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BubbleSort.sort(arr);
        assertArrayEquals(sortedArray, arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests an empty array")
    void emptyArray() {
        int[] arr = new int[0];
        BubbleSort.sort(arr);
        assertArrayEquals(new int[0], arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests an array with size 1")
    void size1() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(1).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BubbleSort.sort(arr);
        assertArrayEquals(sortedArray, arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests an array with only duplicate values")
    void duplicates() {
        int[] arr = new int[480];
        Arrays.fill(arr, 2);
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BubbleSort.sort(arr);
        assertArrayEquals(sortedArray, arr);
    }

}