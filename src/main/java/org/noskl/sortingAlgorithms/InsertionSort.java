package org.noskl.sortingAlgorithms;

public class InsertionSort {

    /**
     * Sorts an int[] in place.
     * @param arr The array to sort.
     */
    public static void sort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                    arr[j] = arr[j - 1] ^ arr[j];
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                }
            }
        }
    }

}
