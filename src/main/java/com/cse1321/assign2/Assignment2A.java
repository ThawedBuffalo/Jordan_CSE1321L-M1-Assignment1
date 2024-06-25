package com.cse1321.assign2;

import java.util.Scanner;

public class Assignment2A {

    public static void main(String[] args) {

        int multipleNumber;
        int targetNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want to find a multiple of: ");
        multipleNumber = sc.nextInt();

        System.out.print("Enter a second number: ");
        targetNumber = sc.nextInt();

        System.out.println("Calculating...");
        int mod = targetNumber / multipleNumber;
        int nearestMultiple = multipleNumber * mod;
        System.out.println("The nearest multiple of " +multipleNumber+ " from " +targetNumber+ " is " +nearestMultiple+ "!");

    }
}
