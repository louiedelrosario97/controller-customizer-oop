package com.pluralsight.models.store;

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.Controller;
import java.util.ArrayList;
import java.util.List;

public class Cart
{
    // List 'Order' can access
    private final List<Controller> controllers;
    private final List<Accessory> accessories;

    // Constructor
    public Cart()
    {
        this.controllers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    // Getters
    public List<Controller> getControllers() { return controllers; }
    public List<Accessory> getAccessories() { return accessories; }

    // Add Methods (Add 1 or more controller(s), accessories)
    public void addController(Controller controller)
    {
        controllers.add(controller);
    }
    public void addAccessory(Accessory accessory)
    {
        accessories.add(accessory);
    }

    // Derived Getter
    // Need to use streams for this logic
    public double getCartTotal() // IC!
    {
        double controllerTotal = controllers.stream()
                .mapToDouble(Controller::getPrice)
                .sum();

        double accessoryTotal = accessories.stream()
                .mapToDouble(Accessory::getPrice)
                .sum();

        return accessoryTotal + controllerTotal;
    }
}

