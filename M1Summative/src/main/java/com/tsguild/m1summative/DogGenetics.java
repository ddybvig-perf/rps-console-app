/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.m1summative;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author daler
 */
//done as of 08:30 sunday 8/18
public class DogGenetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();
        //initializing 5 variables for the 5 different percents then planning to iteratively subtract them from 100 or something
        int percent1 = randomizer.nextInt(101);
        int percent2 = randomizer.nextInt(101 - percent1);
        int percent3 = randomizer.nextInt(101 - percent1 - percent2);
        int percent4 = randomizer.nextInt(101 - percent1 - percent2 - percent3);
        int remainingPercent = 100 - (percent1 + percent2 + percent3 + percent4);
        
//        System.out.println(percent1);
//        System.out.println(percent2);
//        System.out.println(percent3);
//        System.out.println(percent4);
//        System.out.println(remainingPercent);
//        System.out.println(percent1 + percent2 + percent3 + percent4 + remainingPercent);
        
        System.out.println("Welcome to Dale's Dog Genetics Laboratory, Inc.");
        System.out.println("What is your dog's name?");
        String name = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println(name + " is:");
        System.out.println(percent1 + "% Standard Poodle,");
        System.out.println(percent2 + "% Chihuahua,");
        System.out.println(percent3 + "% Great Dane,");
        System.out.println(percent4 + "% Pug,");
        System.out.println("and " + remainingPercent + "% Golden Retriever.");
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
