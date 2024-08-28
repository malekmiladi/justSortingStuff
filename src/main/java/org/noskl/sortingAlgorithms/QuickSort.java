package org.noskl.sortingAlgorithms;

import java.util.List;

public class QuickSort {

    /**
     * Sorts an int[] in place.
     * @param arr The array to sort
     * @param start Starting sort index
     * @param end Ending sort index (inclusive)
     */
    public static void sort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }

        int pivot = partition(arr, start, end);

        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    public static void sort(List<Integer> arr, int start, int end) {
        if (end <= start) {
            return;
        }

        int pivot = partition(arr, start, end);

        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < arr[end]) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    private static int partition(List<Integer> arr, int start, int end) {
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr.get(j) < arr.get(end)) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int s = arr[i];
        arr[i] = arr[j];
        arr[j] = s;
    }

    private static void swap(List<Integer> arr, int i, int j) {
        int s = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, s);
    }

}
