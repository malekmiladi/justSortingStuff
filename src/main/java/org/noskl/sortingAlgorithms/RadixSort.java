package org.noskl.sortingAlgorithms;

public class RadixSort {

    /**
     * Sorts an int[] in place.
     * @param arr The array to sort.
     */
    public static void sort(int[] arr) {
        int max = maxElement(arr);
        for (int i = 1; max / i > 0; i *= 10) {
            countingSortUsingBaseB(arr, i);
        }
    }

    private static void countingSortUsingBaseB(int[] arr, int b) {
        int[] digitCount = new int[10];
        for (int n : arr) {
            digitCount[(n / b) % 10]++;
        }
        for (int i = 1; i < digitCount.length; i++) {
            digitCount[i] += digitCount[i - 1];
        }
        int[] sorted = new int[arr.length];
        for (int i = arr.length - 1; i > -1; i--) {
            int n = arr[i];
            int digit = (n / b) % 10;
            sorted[digitCount[digit] - 1] = n;
            digitCount[digit]--;
        }
        System.arraycopy(sorted, 0, arr, 0, arr.length);
    }

    private static int maxElement(int[] arr) {
        int max = -1;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

}
