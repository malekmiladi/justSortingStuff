package org.noskl.sortingAlgorithms;

public class SelectionSort {

    /**
     * Sorts an int[] in place.
     * @param arr The array to sort.
     */
    public static void sort(int[] arr) {
        int l = arr.length;
        int p = 0;
        int smallest = 0;
        while (p < l) {
            for (int i = p; i < l; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }
            int s = arr[p];
            arr[p] = arr[smallest];
            arr[smallest] = s;
            p++;
            smallest = p;
        }
    }

}
