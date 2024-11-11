package org.sorting_and_searching;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public class Collections {

    // 1
//    static int binarySearch(List> list, T key) {
//
//    }

    static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
            return java.util.Collections.indexedBinarySearch(list, key);
        else
            return java.util.Collections.iteratorBinarySearch(list, key);
    }

    // 2
//    static int binarySearch(List list, T key, Comparator c) {
//
//    }

    static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (c==null)
            return binarySearch((List<? extends Comparable<? super T>>) list, key);

        if (list instanceof RandomAccess || list.size()<BINARYSEARCH_THRESHOLD)
            return java.util.Collections.indexedBinarySearch(list, key, c);
        else
            return java.util.Collections.iteratorBinarySearch(list, key, c);
    }

}
