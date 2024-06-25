package com.cse1321.assign2;

import java.util.Scanner;

public class Lab2A {

    public static void main(String[] args) {

        String nameOne;
        String nameTwo;
        String verb;
        String adverb;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        nameOne = scan.next();

        System.out.print("Enter another name: ");
        nameTwo = scan.next();

        System.out.print("Enter a verb: ");
        verb = scan.next();

        System.out.print("Enter an adverb: ");
        adverb = scan.next();

        System.out.println("Once upon a time, there was a person named " + nameOne +
                        " who had a child named ");
        System.out.println(nameTwo+ ". This child would " + verb + " " +adverb +
                        " while singing to strangers.");


    }
}
