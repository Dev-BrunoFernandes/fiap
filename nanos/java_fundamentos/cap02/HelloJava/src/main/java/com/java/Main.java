package com.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        int age = 10;
        double price = 10.0;
        char gender = 'M';
        boolean haveChildren = true;

        System.out.println(age);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(haveChildren);

        int x = 10;   // Declaração de uma variável do tipo int
        double d = x; // Variável double recebe um tipo int
        long l = x;   // Variável long recebe um tipo int
        float f = x;  // Variável float recebe um tipo int (atenção)
        short s = 20; // Declaração de uma variável do tipo short
        x = s;        // Variável int recebe um tipo short

        double doubleValue = 9.99;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

    }
}