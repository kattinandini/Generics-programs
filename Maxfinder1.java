package com.bridgelab.generics;

public class Maxfinder1<T extends Comparable<T>> {
    public T findMax(T... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("At least one value must be provided.");
        }

        T max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Maxfinder1<Integer> intFinder = new Maxfinder1<>();
        Maxfinder1<Float> floatFinder = new Maxfinder1<>();
        Maxfinder1<String> strFinder = new Maxfinder1<>();

        System.out.println("Max integer: " + intFinder.findMax(10, 5, 20, 15));
        System.out.println("Max float: " + floatFinder.findMax(10.5f, 5.2f, 20.1f, 15.3f));
        System.out.println("Max string: " + strFinder.findMax("apple", "orange", "banana", "kiwi"));
    }
}
