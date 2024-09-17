package com.extra;

import java.util.Scanner;

/*
 * Write a Java Program to print the following number pattern by getting the number of lines from the user;
1
12
123
1234
12345
54321
4321
321
21
1
 
-> Make use of loops with conditionals
-> Take input from the user for the number of lines to be created
-> Maintain code readability by adding comments 
-> Initialise Local Git Repo
-> Stage and Commit Changes
-> Push it to Remote Repo 
-> Send TA's links of the repo to verify completion
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number (from 1 to 9): ");

        int number = scanner.nextInt();

        while(number < 1 && number > 100) {
            System.out.print("Please enter a valid number (from 1 to 9): ");
            number = scanner.nextInt();
        }

        String toPrint = "";

        for (int i = 1; i <= number; i++) {
            toPrint += "" + i;
            System.out.println(toPrint);
        }

        String inverted = "";
        for (int i=0; i < toPrint.length(); i++) {
            char ch = toPrint.charAt(i); //extracts each character
            inverted = ch + inverted; //adds each character in front of the existing string
        }
        for (int i = number; i >= 1; i--) {
            inverted = inverted.substring(0, i);
            System.out.println(inverted);
        }
    }
}