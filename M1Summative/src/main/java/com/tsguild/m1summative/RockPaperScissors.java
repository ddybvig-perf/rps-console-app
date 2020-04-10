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
//as of saturday night 8/17/19 i'm calling this done. i thought i had it done before leaving on friday but i realized
//i didn't have a loop to correct dumb users not entering a valid rock, paper, or scissors integer.
//pretty sure i fixed it with a while loop inside the for loop. good stuff.
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();
        //trying this variable to keep the program running when it's supposed to. 
        //will set it to "false" if needed at appropriate times in the do block:
        //ehh, never mind. that didn't do what I wanted it to, so I used "break" successfully instead. but when 
        //i commented out this boolean it messed things up so it's back. to be honest I'm not sure quite what it
        //does, but it seems to work so it's staying!
        boolean run = true;
        //intializing the score tracking variables to 0:
        int playerScore = 0;
        int computerScore = 0;
        int ties = 0;
        //start of the game!
        while (run = true) {
            //adding a comment here
            System.out.println("Welcome to Dale's Premium Java Console Rock Paper Scissors Game! "
                    + "You may play 1 to 10 rounds. How many rounds would you like to play?");
            int rounds = sc.nextInt();
            if (rounds < 1 || rounds > 10){
                System.out.println("Sorry, we can't play that number of rounds. Goodbye!");
                break; //this ends the program
            } else {
                //System.out.println("game keeps going"); had this in here at first to make sure the first loop stuff worked
                for (int i = 1; i <= rounds; i++){
                
                    System.out.println("Round " + i + "! Type 1 for Rock, 2 for Paper, or 3 for Scissors.");
                    int playerChoice = sc.nextInt();
                    //while loop to print an error message if the user doesn't enter a 1, 2, or 3. seems to work!
                    while (playerChoice < 1 || playerChoice > 3){
                        System.out.println("You must type 1, 2, or 3 for the game to work.");
                        playerChoice = sc.nextInt();
                        if (playerChoice >= 1 && playerChoice <= 3){//may no be necessary
                            break;//may not be necessary
                        }
                    }
                    int computerChoice = randomizer.nextInt(3) + 1;
                    System.out.println("Computer chooses: " + computerChoice + ".");
                    if(playerChoice == 1 && computerChoice == 1){
                        ties++;
                    }
                    else if (playerChoice == 1 && computerChoice == 2){
                        computerScore++;
                    }
                    else if (playerChoice == 1 && computerChoice == 3){
                        playerScore++;
                    }
                    else if (playerChoice == 2 && computerChoice == 1){
                        playerScore++;
                    }
                    else if (playerChoice == 2 && computerChoice == 2){
                        ties++;
                    }
                    else if (playerChoice == 2 && computerChoice == 3){
                        computerScore++;
                    }
                    else if (playerChoice == 3 && computerChoice == 1){
                        computerScore++;
                    }
                    else if (playerChoice == 3 && computerChoice == 2){
                        playerScore++;
                    }
                    else {
                        ties++;
                    }
                }
                System.out.println("SCOREBOARD:");
                System.out.println("Player score: " + playerScore);
                System.out.println("Computer score: " + computerScore);
                System.out.println("Ties: " + ties);
                if (playerScore > computerScore){
                    System.out.println("Congratulations! Chalk up a victory for the human race!");
                }
                else if (computerScore > playerScore){
                    System.out.println("Skynet wins again! These random integer generators are smarter than you think!");
                }
                else {
                    System.out.println("Looks like this one was a tie.");
                }
                System.out.println("Do you want to play again? Type 1 for yes, 0 for no.");
                int playAgain = sc.nextInt();
                if (playAgain == 0){
                    System.out.println("Thanks for playing! Goodbye!");
                    break;
                } else {
                    playerScore = 0;//realized i had to reset these things or else the console would track them into the new game.
                    computerScore = 0;
                    ties = 0;
                }
                
                
            }

        }
    }
}
