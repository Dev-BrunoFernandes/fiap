package com.java.operators;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int x = 10;
        x = x + 1;
        System.out.println(x);

        x--;
        System.out.println(x);

        int y = 10;
        ++y;
        System.out.println("y = " + y);

        --y;
        System.out.println("y = " + y);

        int z = 10, w = 5, a = 5;
        z = w++;
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        z = --a;
        System.out.println("z = " + z);
        System.out.println("a = " + a);
    }
}
