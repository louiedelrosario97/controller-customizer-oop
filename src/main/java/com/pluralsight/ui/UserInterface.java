package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        homeScreen();
    }


//--------------------------------------------------- homeScreen() ----------------------------------------------------

    public static void homeScreen()
    {
        String input;
        boolean runningLoop = true;
        while (runningLoop)
        {
            System.out.println(" Custom GameCube Controller Shop v1.0 ");
            System.out.println("-----------------------------------------");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Select: ");
            input = scanner.nextLine().strip();

            switch (input)
            {
                case "1":
                    break;
                case "0":
                    System.out.println("Thanks for visiting. Goodbye!");
                    runningLoop = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }
//--------------------------------------------------- homeScreen() ----------------------------------------------------

//--------------------------------------------------- homeScreen() ----------------------------------------------------






}

