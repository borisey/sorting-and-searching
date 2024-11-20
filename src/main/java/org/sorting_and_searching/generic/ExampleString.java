package org.sorting_and_searching.generic;

class ExampleString {
    String s1;
    String s2;
    String s3;

    ExampleString(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return s1 + s2 + s3;
    }
}
