package org.noskl.sortingAlgorithms;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BucketSortTest {

    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 480 elements (even size)")
    void randomArray480() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(480).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10);
        assertArrayEquals(sortedArray, arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 485 elements (odd size)")
    void randomArray485() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(485).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10);
        assertArrayEquals(sortedArray, arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests an empty array")
    void emptyArray() {
        int[] arr = new int[0];
        BucketSort.sort(arr, 10);
        assertArrayEquals(new int[0], arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests an array with size 1")
    void size1() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(1).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 480 elements (even size) and 5 buckets")
    void randomArray480Buckets5() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(480).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 5);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 485 elements (odd size) and 5 buckets")
    void randomArray485Buckets5() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(485).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 5);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests an empty array and 5 buckets")
    void emptyArrayBuckets5() {
        int[] arr = new int[0];
        BucketSort.sort(arr, 5);
        assertArrayEquals(new int[0], arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests an array with size 1 and 5 buckets")
    void size1Buckets5() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(1).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 5);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 480 elements (even size) and 1 bucket")
    void randomArray480Buckets1() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(480).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 1);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 485 elements (odd size) and 1 bucket")
    void randomArray485Buckets1() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(485).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 1);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests an empty array and 1 bucket")
    void emptyArrayBuckets1() {
        int[] arr = new int[0];
        BucketSort.sort(arr, 1);
        assertArrayEquals(new int[0], arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests an array with size 1 and 1 bucket")
    void size1Buckets1() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(1).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 1);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 480 elements (even size) and 10000 buckets")
    void randomArray480Buckets10000() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(480).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10000);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests a randomly generated integer array of 485 elements (odd size) and 10000 buckets")
    void randomArray485Buckets10000() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(485).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10000);
        assertArrayEquals(sortedArray, arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests an empty array and 10000 buckets")
    void emptyArrayBuckets10000() {
        int[] arr = new int[0];
        BucketSort.sort(arr, 10000);
        assertArrayEquals(new int[0], arr);
    }

    @Disabled
    @RepeatedTest(10)
    @DisplayName("Tests an array with size 1 and 10000 buckets")
    void size1Buckets10000() {
        int[] arr = IntStream.generate(() -> new Random().nextInt(10000)).limit(1).toArray();
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10000);
        assertArrayEquals(sortedArray, arr);
    }

    @RepeatedTest(10)
    @DisplayName("Tests an array with only duplicate values and 10000 buckets")
    void duplicates() {
        int[] arr = new int[480];
        Arrays.fill(arr, 2);
        int[] sortedArray = Arrays.stream(Arrays.copyOfRange(arr, 0, arr.length)).sorted().toArray();
        BucketSort.sort(arr, 10000);
        assertArrayEquals(sortedArray, arr);
    }

}