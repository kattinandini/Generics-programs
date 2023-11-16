package com.bridgelab.generics;

public class MaxStr {
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
        String strMax = findMax("apple", "orange", "banana");
        System.out.println("Max string: " + strMax);
    }
}
