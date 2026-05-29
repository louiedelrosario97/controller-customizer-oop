package com.pluralsight.models.controller;

import com.pluralsight.interfaces.IPriceable;
// BaseController is not a Cosmetic, but still implements IPriceable
public class BaseController implements IPriceable
{
    // Variables
    private final String name;
    private final double price;

    // Constructor
    public BaseController(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public String toString()
    {
        return String.format("%-15s | $%.2f", name, price); // LM!
    }

    @Override
    public String getDetails() { return ""; }
}

