package org.sorting_and_searching.generic;

class ExampleInteger {
    int a;
    int b;
    int c;

    ExampleInteger(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return Integer.toString(a + b + c);
    }
}
