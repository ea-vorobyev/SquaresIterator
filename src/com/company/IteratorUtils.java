package com.company;

public class IteratorUtils {

    public static Iterable<Integer> squares(int left, int right) {
        return new SquaresIterable(left, right);
    }

}
