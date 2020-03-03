package edu.cscc;

import java.util.*;
//Dominic Cotugno 3/2/2020
//This program is to play rock, paper, scissors. The lab is to add documentation for this program.
/**
 * @author Dominic cotugno
 * @version 1
 * Main for Rock, Paper, Scissors, Lizard, Spock
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * Main method for running Rock, Paper, Scissors, Lizard, Spock
     * @param args run-time arguments
     */
    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        // get the players input "rock, paper, scissors, lizard, spock. This will also see if the input is valid"
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);
                // the computer picks its chose in the game of rock, paper, scissors and displays it
            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            // decides who the winner is
            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            // asks the user if they want to play again
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}