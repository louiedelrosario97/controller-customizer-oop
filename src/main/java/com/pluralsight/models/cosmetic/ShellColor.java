package com.pluralsight.models.cosmetic;

public class ShellColor extends Cosmetic
{
    private static final double price = 50.00;

    public ShellColor(String color)
    {
        super("Shell Color", color);
    }

    @Override
    public double getPrice()
    {
        return price;
    }
}

