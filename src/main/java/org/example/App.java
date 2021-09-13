/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        // created one input variable so the user can input their information to get their BAC
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        int gender = Integer.parseInt(input.nextLine());
        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = Integer.parseInt(input.nextLine());
        System.out.print("What is your weight, in pounds? ");
        int weight = Integer.parseInt(input.nextLine());
        System.out.print("How many hours has it been since your last drink? ");
        int hours = Integer.parseInt(input.nextLine());

        // created ternary operator for ratio
        double ratio = gender == 1 ? 0.73 : 0.66;

        // math for the blood alcohol content
        double bloodAlcohol = (ounces * 5.14 / weight * ratio) - 0.015 * hours;

        // used a ternary operator for BAC output message
        System.out.println(String.format("Your BAC is %f", bloodAlcohol));
        System.out.println(bloodAlcohol < 0.08 ? "It is legal for you to drive." : "It is not legal for you to drive.");
    }
}