package com.company;

import static com.company.IteratorUtils.squares;

public class TestSquare {
    public static void main(String[] args) {
        for(int index: squares(0, 99)) {
            System.out.print(" " + index);
        }
    }
}
