package org.noskl.sortingAlgorithms;

public class CountingSort {

    /**
     * Sorts an int[] in place.
     * @param arr The array to sort.
     */
    public static void sort(int[] arr) {
        int max = 0;
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        int[] countAndSum = new int[max + 1];
        for (int n : arr) {
            countAndSum[n]++;
        }
        for (int j = 1; j < countAndSum.length; j++) {
            countAndSum[j] += countAndSum[j - 1];
        }
        int[] sorted = new int[arr.length];
        for (int i = arr.length - 1; i > -1; i--) {
            int n = arr[i];
            sorted[countAndSum[n] - 1] = n;
            countAndSum[n]--;
        }
        System.arraycopy(sorted, 0, arr, 0, arr.length);
    }

}
