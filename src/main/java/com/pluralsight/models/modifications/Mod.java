package com.pluralsight.models.modifications;

import com.pluralsight.interfaces.IPriceable;

public abstract class Mod implements IPriceable
{
    private String name;

    public Mod(String name)
    {
        this.name = name;
    }

    // Getters
    public String getName() { return name; }

    @Override
    public abstract double getPrice();
}

