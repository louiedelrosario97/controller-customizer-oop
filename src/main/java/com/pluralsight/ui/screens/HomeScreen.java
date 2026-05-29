package com.pluralsight.ui.screens;

import java.util.Scanner;

import static com.pluralsight.ui.screens.OrderScreen.orderScreen;

public class HomeScreen

{
    public static Scanner scanner = new Scanner(System.in);

    public static void homeScreen()
    {
        IO.println("\n Custom GameCube Controller Shop v1.0 ");
        IO.println("-----------------------------------------");
        IO.println("1) Visit Shop");
        IO.println("0) Close Application");
        boolean runningLoop = true;
        while (runningLoop)
        {
            IO.print("Select: ");

            String input = scanner.nextLine().strip();

            switch (input)
            {
                case "1":
                    orderScreen();
                    break;
                case "0":
                    IO.println("\nClosing application...");
                    runningLoop = false;
                    break;
                default:
                    IO.println("\nInvalid option. Please try again.");
            }
        }
    }
}



