package org.sorting_and_searching;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

public class Arrays {

    // 1
    static int binarySearch(byte[] a, byte key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 2
    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 3
    static int binarySearch(char[] a, char key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 4
    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 5
    static int binarySearch(double[] a, double key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 6
    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 7
    static int binarySearch(float[] a, float key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 8
    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 9
    static int binarySearch(int[] a, int key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 10
    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 11
    static int binarySearch(long[] a, long key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 12
    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 13
    static int binarySearch(short[] a, short key) {
        return binarySearch0(a, 0, a.length, key);
    }

    // 14
    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // 15
    static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch0(a, 0, a.length, key, c);
    }

    // 16
    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key, c);
    }

    private static int binarySearch0(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

    static void rangeCheck(int arrayLength, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(
                    "fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }
        if (toIndex > arrayLength) {
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }
}
