/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.m1summative;

/**
 *
 * @author daler
 */

//so far it works for the one array but i'm not sure how to get it to pass in any array since 
//the syntax in the method seems to only work for the one i call "numbers"
//upon thinking about it i guess the scope of "numbers" in the method does not go into the main, which makes sense.
//still don't fully understand how it's all working, but this code does what has been asked.
//it is kind of repetitive. doubt there's a way to get around hard coding in the actual array values,
//but there probably is a way to loop the process of printing the values, passing them into the method,
//and printing the sum.

public class SummativeSums {
    public static void main(String[] args) {
        int[] numbers1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        System.out.println("Array #1: { 1, 90, -33, -55, 67, -16, 28, -55, 15 }");
        int sum1 = arraySum(numbers1);
        System.out.println("The sum of this array is " + sum1);
        int [] numbers2 = { 999, -60, -77, 14, 160, 301 };
        System.out.println("Array #2: { 999, -60, -77, 14, 160, 301 }");
        int sum2 = arraySum(numbers2);
        System.out.println("The sum of this array is " + sum2);
        int [] numbers3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 };
        System.out.println("Array #3: { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, \n" +
"140, 150, 160, 170, 180, 190, 200, -99 }");
        int sum3 = arraySum(numbers3);
        System.out.println("The sum of this array is " + sum3);
        
    }
    
    public static int arraySum(int[] numbers) {
        //initialize a variable to track the sum
        int sum = 0;
        //enhanced for loop to add each number in the array:
        for (int n : numbers) {
        sum = sum + n;
        }
        //return statement:
        return sum;
        
    }
}
