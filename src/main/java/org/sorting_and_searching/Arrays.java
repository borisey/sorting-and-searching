package org.sorting_and_searching;

import java.util.Comparator;

public class Arrays {

    // 1
    static int binarySearch(byte[] a, byte key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 2
    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 3
    static int binarySearch(char[] a, char key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 4
    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 5
    static int binarySearch(double[] a, double key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 6
    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 7
    static int binarySearch(float[] a, float key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 8
    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 9
    static int binarySearch(int[] a, int key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 10
    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 11
    static int binarySearch(long[] a, long key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 12
    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 13
    static int binarySearch(short[] a, short key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 14
    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 15
    static <T> int binarySearch(T[] a, T key, Comparator c) {
        return binarySearch(a, 0, a.length - 1, key, c);
    }

    // 16
    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];

            if (c.compare(midVal, key) < 0)
                low = mid + 1;
            else if (c.compare(midVal, key) > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}