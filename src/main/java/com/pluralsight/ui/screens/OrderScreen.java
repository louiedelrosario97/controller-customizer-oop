package com.pluralsight.ui.screens;

// This screen navigates through the application. Collects custom controller build data to List<Controller> when created,
// collects accessory data to List<Accessory> when adding to cart. Routes to CheckoutScreen.

import static com.pluralsight.ui.screens.HomeScreen.scanner;

public class OrderScreen
{
    public static void orderScreen()
    {
        boolean runningLoop = true;
        while (runningLoop)
        {
            System.out.println("\n    Order Screen    ");
            System.out.println("--------------------------");
            System.out.println("1) Build A Controller");
            System.out.println("2) Accessory Catalog");
            System.out.println("3) Checkout");
            System.out.println("4) Check Cart");
            System.out.println("0) Cancel Order");
            System.out.print("Select: ");

            String input = scanner.nextLine().trim();

            switch(input)
            {
                case "1": BuildScreen.start(); break;
//                case "2": accessoryScreen();   break;
//                case "3": checkOutScreen();    break;
//                case "4": cartDisplay();       break;
                case "0": runningLoop = false; break;
                default: System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

