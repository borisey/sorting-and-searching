package org.sorting_and_searching.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static <T> void printList(List<T> list) {
        for (T t: list) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        List<ExampleInteger> intList = new ArrayList<>();
        intList.add(new ExampleInteger(1, 2, 3));
        intList.add(new ExampleInteger(4, 5, 6));
        intList.add(new ExampleInteger(7, 8, 9));
        List<ExampleString> strList = new ArrayList<>();
        strList.add(new ExampleString("a", "b", "c"));
        strList.add(new ExampleString("d", "e", "f"));
        strList.add(new ExampleString("g", "h", "i"));
        printList(intList);
        printList(strList);
    }
}