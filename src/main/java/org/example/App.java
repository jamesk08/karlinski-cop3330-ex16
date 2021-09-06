/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final int LEGAL_DRIVING_AGE = 16;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        int ageInput = scanner.nextInt();

        String displayMessage = MessageFormat.format(
            "You are {0}old enough to legally drive.",
            ageInput >= LEGAL_DRIVING_AGE ? "" : "not "
        );

        System.out.println(displayMessage);
    }
}
