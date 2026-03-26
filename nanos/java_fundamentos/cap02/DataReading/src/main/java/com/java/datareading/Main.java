package com.java.datareading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        age = sc.nextInt();

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

        sc.close();
    }
}