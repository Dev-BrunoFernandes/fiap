package com.java.flow;

public class ControlFlow {
    public static void main(String[] args) {
        int age = 15;

        if (age < 0)
            System.out.println("Invalid age");

        if (age >= 18 && age < 70) {
            System.out.println("Legal age");

        } else if (age >= 70) {
            System.out.println("Old age");

            if (age >= 100) {
                System.out.println("Centenary");
            }
        } else {
            System.out.println("Minor");
        }
    }
}