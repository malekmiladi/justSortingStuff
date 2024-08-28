package org.noskl.sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    public static void sort(int[] arr, int nBuckets) {
        if (arr.length < 2) {
            return;
        }
        int maxElement = getMaxElement(arr);
        int bucketRange = getBucketRange(maxElement, nBuckets);
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < nBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int n : arr) {
            placeInBucket(buckets, bucketRange, n);
        }
        for (List<Integer> bucket : buckets) {
            QuickSort.sort(bucket, 0, bucket.size() - 1);
        }
        int p = 0;
        for (List<Integer> bucket : buckets) {
            for (Integer integer : bucket) {
                arr[p] = integer;
                p++;
            }
        }
    }

    private static int getMaxElement(int[] arr) {
        int max = -1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static int getBucketRange(int max, int nBuckets) {
        return (int)Math.ceil((double)max / nBuckets) + 1;
    }

    private static void placeInBucket(List<List<Integer>> buckets, int bucketRange, int n) {
        int bucketIndex = findBucket(n, bucketRange);
        buckets.get(bucketIndex).add(n);
    }

    private static int findBucket(int n, int bucketRange) {
        return (int)Math.floor((double)n / bucketRange);
    }

}