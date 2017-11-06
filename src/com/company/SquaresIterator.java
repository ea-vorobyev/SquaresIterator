package com.company;

import java.util.Iterator;

public class SquaresIterator implements Iterator<Integer> {
    private int current;
    private final int max;

    public SquaresIterator(int current, int max) {
        this.current = current;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        while(current <= max) {
            if (Math.sqrt(current) % 1 == 0.0) {
                return true;
            }
            current++;
        }
        return false;
    }

    @Override
    public Integer next() {
        return current++;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
