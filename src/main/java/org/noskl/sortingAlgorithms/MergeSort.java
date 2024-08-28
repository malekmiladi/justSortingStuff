package org.noskl.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    /**
     * Sorts an int[].
     * @param arr The array to sort.
     * @return A new int[] containing the elements of arr sorted in ascending order
     */
    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        leftHalf = sort(leftHalf);
        rightHalf = sort(rightHalf);

        return merge(leftHalf, rightHalf);
    }

    private static int[] merge(int[] leftHalf, int[] rightHalf) {
        int[] merger = new int[leftHalf.length + rightHalf.length];
        int i = 0;
        int j = 0;
        int p = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] < rightHalf[j]) {
                merger[p] = leftHalf[i];
                i++;
            } else {
                merger[p] = rightHalf[j];
                j++;
            }
            p++;
        }
        while (i < leftHalf.length) {
            merger[p] = leftHalf[i];
            i++;
            p++;
        }
        while (j < rightHalf.length) {
            merger[p] = rightHalf[j];
            j++;
            p++;
        }
        return merger;
    }

}
