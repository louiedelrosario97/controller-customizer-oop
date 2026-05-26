package com.pluralsight.models.store;

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
    // List 'Order' can access
    private List<Controller> controllers;
    private List<Accessory> accessory;

    // Constructor
    public Cart()
    {
        this.controllers = new ArrayList<>();
        this.accessory = new ArrayList<>();
    }

    // Methods (Add 1 or more controller(s), accessories)
    public void addController(Controller controller)
    {

    }

    public void addAccessory(Accessory accessory)
    {

    }

    // Derived Getter
    public double getCartTotal()
    {
        double total = 0;
    }
}

