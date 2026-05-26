package com.pluralsight.models.modifications;

import com.pluralsight.interfaces.IPriceable;

public abstract class Mod implements IPriceable
{
    // Mod Characteristic(s)
    private String name;

    // Constructor
    public Mod(String name)
    {
        this.name = name;
    }

    // Getter
    public String getName() { return name; }

    // Abstract Method
    @Override
    public abstract double getPrice();
}

