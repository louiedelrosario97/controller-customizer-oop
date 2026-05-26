package com.pluralsight.ui.screens;

import static com.pluralsight.ui.main.Main.orderScreen;
import static com.pluralsight.ui.main.Main.scanner;

public class HomeScreen

{
    public static void homeScreen() {
        String input;
        boolean runningLoop = true;
        while (runningLoop)
        {
            System.out.println(" Custom GameCube Controller Shop v1.0 ");
            System.out.println("-----------------------------------------");
            System.out.println("1) Create Order");
            System.out.println("0) Close");
            System.out.print("Select: ");
            input = scanner.nextLine().strip();

            switch (input) {
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



