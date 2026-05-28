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
            System.out.println("\nCommission are made-to-order. Commission availability opens up in monthly cycles. \nIf commissions are closed, join our mailing list for updates! ");
            System.out.println(" [ COMMISSIONS AVAILABILITY: OPEN ] ");
            System.out.println("1) Design Your Own");
            System.out.println("2) Accessory Catalog");
            System.out.println("3) Checkout");
            System.out.println("4) Check Cart");
            System.out.println("0) Cancel Order");
            System.out.print("Select: ");

            String input = scanner.nextLine().trim();

            switch(input)
            {
                case "1": cart.addController(BuildScreen.start());         break;
                case "2": cart.addAccessory(addAccessory());
                          System.out.println("Accessory added to cart!");  break;
                case "3": CheckoutScreen.start(cart); runningLoop = false; break;
                case "4": cartDisplay(cart);                               break;
                case "0": runningLoop = false;                             break;
                default: System.out.println("Invalid option. Please try again.");
            }
        }
    }
// --------------------------------------------- addAccessory() -------------------------------------------------------
    public static Accessory addAccessory()
    {
        System.out.println("\n Accessories ");
        System.out.println("-------------------");
        List<Accessory> accessories = CatalogData.getAccessory();
        for(int i = 0; i < accessories.size(); i++)
        {
            System.out.println((i + 1) + ") " + accessories.get(i));
        }
        System.out.print("Select: ");
        int input = Integer.parseInt(scanner.nextLine().trim());

        return accessories.get(input - 1);
    }
// --------------------------------------------- cartDisplay() --------------------------------------------------------
    public static void cartDisplay(Cart cart)
    {
        // Controllers
        System.out.println("\nControllers:");
        for (int i = 0; i < cart.getControllers().size(); i++)
        {
            Controller controller = cart.getControllers().get(i);
            System.out.println((i + 1) + ") " + controller.getDetails());
        }


        // Accessories
        System.out.println("Accessories:");
        for (int i = 0; i < cart.getAccessories().size(); i++)
        {
            Accessory accessory = cart.getAccessories().get(i);
            System.out.println((i + 1) + ") " + accessory.getDetails());
        }

        // Displays cart total
        System.out.printf("Cart Total: $%.2f%n", cart.getCartTotal());
    }
}


