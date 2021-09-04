/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pastVerb = null;
        String verb = null;

        System.out.println("Choose a letter a-c ");
        String letter = scan.nextLine();

        if(letter.equals("c")) {
            System.out.println("Enter a past tense verb: ");
            pastVerb = scan.nextLine();
        }

        System.out.println("Enter a noun: ");
        String noun = scan.nextLine();

        if(!letter.equals("c")) {
            System.out.println("Enter a verb: ");
            verb = scan.nextLine();
        }

        System.out.println("Enter an adjective: ");
        String adjective = scan.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scan.nextLine();

        if(letter.equals("a"))
            System.out.println("The " + noun + " can " + verb + " " + adverb + " over the " + adjective + " wall.");
        else if(letter.equals("b"))
            System.out.println("My " + noun + " likes to " + verb + " " + adverb + ". It's very " + adjective + "!");
        else if(letter.equals("c"))
            System.out.println("Last week, I " + pastVerb + " " + adverb + " without telling my " + adjective + " " + noun + ".");
    }

}
