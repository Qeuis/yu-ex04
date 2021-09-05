/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution04
 *  Copyright 2021 Danny Yu
 */

// Program will create adlibbed statement from user inputs

import java.util.Scanner;

public class Solution04
{
    /*
       prompt user for noun
        user inputs noun
       prompt user for verb
        user inputs verb
       prompt user for adjective
        user inputs adjective
       prompt user for adverb
        user inputs adverb
       Program prints formatted adlib statement
     */
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's so freaking funny!", verb, adjective, noun, adverb);
    }
}
