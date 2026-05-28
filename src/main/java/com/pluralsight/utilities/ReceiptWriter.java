package com.pluralsight.utilities;

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.Controller;
import com.pluralsight.models.store.Order;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter
{
    public static void writeReceipt(Order order)
    {   // IC! (PrintWriter vs BufferedWriter)
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = date.format(formatter);

        try (FileOutputStream fileOutputStream = new FileOutputStream("receipts/" + order.getCustomer().getLastName() + "_" + timestamp + ".txt");
             PrintWriter writer = new PrintWriter(fileOutputStream))
        {
            writer.println("Order Summary: ");
            writer.println("Date: " + timestamp);
            writer.println();

            // controllers
            writer.println("Controllers:");
            for (Controller controller : order.getCart().getControllers())
            {
                writer.println(controller.getDetails());
            }

            // accessories
            writer.println("Accessories:");
            for (Accessory accessory : order.getCart().getAccessories())
            {
                writer.println(accessory.getDetails());
            }


            writer.println("----------------------------------");
            writer.println("Order Total: $" + order.getOrderTotal());
            writer.println("=========================");

            System.out.println("Receipt saved to: receipts/" + order.getCustomer().getFirstName() + "_" + timestamp + ".txt");
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}

