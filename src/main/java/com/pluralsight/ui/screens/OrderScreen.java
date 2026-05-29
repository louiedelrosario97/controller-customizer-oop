package com.pluralsight.ui.screens;

// This screen navigates through the application. Collects custom controller build data to List<Controller> when created,
// collects accessory data to List<Accessory> when adding to cart. Routes to CheckoutScreen.

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.Controller;
import com.pluralsight.models.store.Cart;
import com.pluralsight.utilities.CatalogData;
import java.util.List;
import static com.pluralsight.ui.screens.HomeScreen.scanner;

public class OrderScreen
{
    public static void orderScreen()
    {
        Cart cart = new Cart();

        boolean runningLoop = true;
        while (runningLoop)
        {
            IO.println("\n◇─────────────────────────────────────────────────────────────────────────────────◇");
            IO.println("Commissions are made-to-order. Commission availability opens up in monthly cycles.");
            IO.println("          If commissions are closed, join our mailing list for updates! ");
            IO.println("◇─────────────────────────────────────────────────────────────────────────────────◇");
            IO.println("\n                    [ COMMISSION AVAILABILITY: OPEN ]");
            IO.println("                     ═ ════════════•••════════════ ═");
            IO.println("1) Design Your Own");
            IO.println("2) Accessory Catalog");
            IO.println("3) Checkout");
            IO.println("4) Check Cart");
            IO.println("0) Cancel Order");
            IO.print("Select: ");

            String input = scanner.nextLine().trim();

            switch(input)
            {
                case "1": cart.addController(DesignScreen.start());        break;
                case "2": cart.addAccessory(addAccessory());
                      IO.println("\nAccessory added to cart!");            break;
                case "3": CheckoutScreen.start(cart); runningLoop = false; break;
                case "4": cartDisplay(cart);                               break;
                case "0": runningLoop = false;                             break;
                default: IO.println("\nInvalid option. Please try again.");
            }
        }
    }
// --------------------------------------------- addAccessory() -------------------------------------------------------
    public static Accessory addAccessory()
    {
        IO.println("\n Accessories ");
        IO.println("-------------------");
        List<Accessory> accessories = CatalogData.getAccessory();
        for(int i = 0; i < accessories.size(); i++)
        {
            IO.println((i + 1) + ") " + accessories.get(i));
        }
        IO.print("Select: ");
        int input = Integer.parseInt(scanner.nextLine().trim());

        return accessories.get(input - 1);
    }
// --------------------------------------------- cartDisplay() --------------------------------------------------------
    public static void cartDisplay(Cart cart)
    {
        // Controllers
        IO.println("\nControllers:\n");
        for (int i = 0; i < cart.getControllers().size(); i++)
        {
            Controller controller = cart.getControllers().get(i);
            IO.println((i + 1) + ") " + controller.getDetails());
        }


        // Accessories
        IO.println("Accessories:");
        for (int i = 0; i < cart.getAccessories().size(); i++)
        {
            Accessory accessory = cart.getAccessories().get(i);
            IO.println((i + 1) + ") " + accessory.getDetails());
        }

        // Displays cart total
        System.out.printf("\nCart Total: $%.2f%n", cart.getCartTotal());
    }
}


