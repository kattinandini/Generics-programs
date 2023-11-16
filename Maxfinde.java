package com.bridgelab.generics;

public class Maxfinde<T extends Comparable<T>> {
    private T x, y, z;

    public Maxfinde(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T findMax() {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
}}
