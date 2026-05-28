package com.pluralsight.models.accessory;

import com.pluralsight.interfaces.IPriceable;

public class Accessory implements IPriceable // CarryingCase, Controller stand
{
    private String name;
    private double price;

    // Constructor
    public Accessory(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() { return name; }

    @Override
    public String getDetails()  { return String.format("   %s: $%.2f", name, price); }

    @Override
    public double getPrice() { return price; }

    @Override
    public String toString()
    {
        return String.format("%s | $%.2f", name, price);
    }
}

