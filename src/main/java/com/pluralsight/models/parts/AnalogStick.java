package com.pluralsight.models.parts;

public class AnalogStick extends Part
{
    private String stickType; // Joystick or CStick
    private boolean isPainted;

    private final double paintedPrice = 5.00;
    private final double defaultPrice = 0.00;

    public AnalogStick(String name, String color, String stickType, boolean isPainted)
    {
        super(name, color, stickType, );
    }

    // Getters
    public String getStickType() { return stickType; }
    public boolean isPainted() { return isPainted; }
    public double getPaintedPrice() { return paintedPrice; }
    public double getDefaultPrice() { return defaultPrice; }

    @Override
    public double getPrice() {}
}

// I may have to rename/create this class. Because we will be adding all the mods
// into a List<Mod> to calculate the price. So we don't need boolean isPainted.