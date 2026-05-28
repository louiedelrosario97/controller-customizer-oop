package com.pluralsight.ui.screens;

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.Controller;
import com.pluralsight.models.store.Cart;

import static com.pluralsight.ui.screens.HomeScreen.scanner;

public class CheckoutScreen
{ // Displays cart items with $ totals. And prompts user to confirm.
    public static void start(Cart cart)
    {
        IO.println("\n   Checkout   ");
        IO.println("----------------------------------");

// ----------------------------------------- [ Display Order Summary ] ---------------------------------------------------

        IO.println("\n   [ Order Summary ]");

        IO.println("Controllers:");
        for (Controller controller : cart.getControllers())
        {
            IO.println(controller.getDetails());
        }


        IO.println("Accessories:");
        for (Accessory accessory : cart.getAccessories())
        {
            IO.println(accessory.getDetails());
        }


        IO.println("----------------------------------");
        System.out.printf("Order Total: $%.2f%n", cart.getCartTotal());
        IO.println();


                                        // TODO: collect customer info
// ----------------------------------------- [ Confirm Order ] --------------------------------------------------------

        IO.print("Confirm order? (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                IO.println("\nOrder confirmed. Thank you for your purchase!");

                IO.print("\nContinue shopping? (Y/N): ");
                switch (scanner.nextLine().toUpperCase())
                {
                    case "Y": HomeScreen.homeScreen(); break;
                    case "N":
                        IO.println("Thanks for shopping! Goodbye!");
                        System.exit(0); // IC! (.exit(0) closes the application)
                        break;
                    default:
                        IO.println("Invalid input. Returning to home screen.");
                        HomeScreen.homeScreen();
                        break;
                }
                break;

            case "N":  IO.println("Order cancelled. Returning to order screen..."); break;
            default:  IO.println("Invalid input. Please try again.");               break;
        }
    }
}

