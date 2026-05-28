package com.pluralsight.models.modifications;

import com.pluralsight.interfaces.IPriceable;

public abstract class Mod implements IPriceable
{
    // Mod Characteristic(s)
    private final String name;

    // Constructor
    public Mod(String name)
    {
        this.name = name;
    }

    // Getter
    public String getName() { return name; }

    // Abstract Method
    @Override
    public abstract double getPrice(); // Logic is built in each of the child classes

    @Override
    public String getDetails() { return String.format("   %s: $%.2f", name, getPrice()); }
}

