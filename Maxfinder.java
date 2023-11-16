package com.bridgelab.generics;

public class Maxfinder {
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
        float floatMax = findMax(10.5f, 5.2f, 20.1f);
        System.out.println("Max float: " + floatMax);
    }
}
