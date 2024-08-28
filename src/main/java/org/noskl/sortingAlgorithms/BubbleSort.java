package org.noskl.sortingAlgorithms;

public class BubbleSort {

    /**
     * Sorts an int[] in place.
     * @param arr The array to sort.
     */
    public static void sort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            boolean didSwap = false;
            for (int j = 0; j < l - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int s = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = s;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
    }

}
