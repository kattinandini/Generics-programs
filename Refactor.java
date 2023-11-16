package com.bridgelab.generics;

public class Refactor {
    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer intMax = findMax(10, 5, 20);
        Float floatMax = findMax(10.5f, 5.2f, 20.1f);
        String strMax = findMax("apple", "orange", "banana");

        System.out.println("Max integer: " + intMax);
        System.out.println("Max float: " + floatMax);
        System.out.println("Max string: " + strMax);
    }
}
