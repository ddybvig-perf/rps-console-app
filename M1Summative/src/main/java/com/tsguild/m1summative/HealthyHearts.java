/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.m1summative;

import java.util.Scanner;

/**
 *
 * @author daler
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        int maxHR = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR Zone is " + (.5 * maxHR) + " - " + (.85 * maxHR) + " beats per minute.");
    }
    
}
