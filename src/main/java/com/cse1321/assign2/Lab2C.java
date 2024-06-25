package com.cse1321.assign2;

import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args) {

        int width;
        int height;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a width: ");
        width = sc.nextInt();

        System.out.print("Enter a height: ");
        height = sc.nextInt();

        int area = width * height;
        int perimeter = 2 * (height+width);

        System.out.println("The area is " +area);
        System.out.println("The perimeter is " +perimeter);

    }

}
