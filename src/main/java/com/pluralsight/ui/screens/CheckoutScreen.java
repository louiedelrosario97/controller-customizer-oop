package com.pluralsight.ui.screens;

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.Controller;
import com.pluralsight.models.store.Cart;

import static com.pluralsight.ui.screens.HomeScreen.scanner;

public class CheckoutScreen
{ // Displays cart items with $ totals. And prompts user to confirm.
    public static void start(Cart cart)
    {
        System.out.println("\n   Checkout   ");
        System.out.println("----------------------------------");

// ----------------------------------------- [ Display Order Summary ] ---------------------------------------------------

        System.out.println("\n   [ Order Summary ]");

        System.out.println("Controllers:");
        for (Controller controller : cart.getControllers())
        {
            System.out.println(controller.getDetails());
        }


        System.out.println("Accessories:");
        for (Accessory accessory : cart.getAccessories())
        {
            System.out.println(accessory.getDetails());
        }


        System.out.println("----------------------------------");
        System.out.printf("Order Total: $%.2f%n", cart.getCartTotal());
        System.out.println();


                                        // TODO: collect customer info
// ----------------------------------------- [ Confirm Order ] --------------------------------------------------------

        System.out.print("Confirm order? (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                System.out.println("\nOrder confirmed. Thank you for your purchase!");

                System.out.print("\nContinue shopping? (Y/N): ");
                switch (scanner.nextLine().toUpperCase())
                {
                    case "Y": HomeScreen.homeScreen(); break;
                    case "N":
                        System.out.println("Thanks for shopping! Goodbye!");
                        System.exit(0); // IC! (.exit(0) closes the application)
                        break;
                    default:
                        System.out.println("Invalid input. Returning to home screen.");
                        HomeScreen.homeScreen();
                        break;
                }
                break;

            case "N":  System.out.println("Order cancelled. Returning to order screen..."); break;
            default:  System.out.println("Invalid input. Please try again.");               break;
        }
    }
}

