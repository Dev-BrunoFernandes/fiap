package com.java.operators;

public class LogicalOperator {
    public static void main(String[] args) {
        var age = 20;
        boolean needToVote = age >= 18 && age <= 70;
        System.out.println(needToVote);

        int nYellow = 2, nRed = 1;
        boolean suspended = nYellow == 2 ||  nRed == 1;
        System.out.println(suspended);

        int x = 9, y = 11;
        boolean test = x > 10 ^ y > 10;
        System.out.println(test);

        boolean legalAge = !(age >= 18);
        System.out.println(legalAge);
    }
}
