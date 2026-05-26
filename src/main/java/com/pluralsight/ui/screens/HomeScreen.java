package com.pluralsight.ui.screens;

import java.util.Scanner;

import static com.pluralsight.ui.screens.OrderScreen.orderScreen;

public class HomeScreen

{
    public static Scanner scanner = new Scanner(System.in);

    public static void homeScreen()
    {
        boolean runningLoop = true;
        while (runningLoop)
        {
            System.out.println(" Custom GameCube Controller Shop v1.0 ");
            System.out.println("-----------------------------------------");
            System.out.println("1) Create Order");
            System.out.println("0) Close");
            System.out.print("Select: ");

            String input = scanner.nextLine().strip();

            switch (input)
            {
                case "1":
                    orderScreen();
                    break;
                case "0":
                    System.out.println("Closing application...");
                    runningLoop = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}



