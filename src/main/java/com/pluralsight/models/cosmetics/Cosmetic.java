package com.pluralsight.models.cosmetics;

import com.pluralsight.interfaces.IPriceable;

public abstract class Cosmetic implements IPriceable
{
    // Variables
    String name;
    String color;

    // Constructor
    public Cosmetic(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    // Getters
    public String getName() { return name; }
    public String getColor() { return color; }

    // Setters
    public void setName(String name) { this.name = name;}
    public void setColor(String color) { this.color = color; }

    // Abstract Method
    @Override
    public abstract double getPrice(); // Logic is built in each of the child classes

    @Override
    public String getDetails() { return String.format("   %s (%s): $%.2f", name, color, getPrice()); }

    // Format for screens
    @Override
    public String toString() { return String.format("%s | Color: %s | $%.2f", name, color, getPrice()); }


}

