package br.com.fiap.si;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        double imc = weight / (height * height);

        if (imc >= 18.5 && imc <= 25) {
            System.out.println("You're at your ideal weight");
        } else {
            System.out.println("You're not at your ideal weight");
        }
    }
}