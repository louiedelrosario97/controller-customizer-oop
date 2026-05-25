package com.pluralsight.models.modifications;

public class TactileZMod extends Mod
{
    // No boolean variable needed. We will store all mods in List<Mod>
    // This will allow us to make changes w/o needing to change this class.

    // Pricing Variables
    private static final double price = 30.00;

    public TactileZMod()
    { super("Tactile Z Button"); }

    @Override
    public double getPrice() { return price; }
}

