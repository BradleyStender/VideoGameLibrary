package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    //Menu to prompt user for library options
    public void startMenu() {

        System.out.println("Welcome to the video game library. what would you like to do? \n" +
                "1. Add game to library \n" +
                "2. Remove game from library \n" +
                "3. view games currently in library \n" +
                "4. Check out an game \n" +
                "5. Check an game in \n" +
                "6. View checked out games \n" +
                "7.Exit the program");

        try {

            switch (input.nextInt()) {
                case 1:
                    Game game = new Game();
                //    game.addGame();
                    //add game
                    break;
                case 2:
                    //remove game
                    break;
                case 3:
                    //view library
                    break;
                case 4:
                    //check out game
                    break;
                case 5:
                    //check in game
                    break;
                case 6:
                    //view checked out games
                    break;
                case 7:
                    System.exit(0);
                    //exit program
                    break;
                default:
                    //prompt user to pick correct number and loop back to menu
                    break;


            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 - 7.");
            startMenu();
        }
    }


}
