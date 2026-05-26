package com.pluralsight.models.parts;

public class StickColor extends Part
{
    private final String stickType;// Joystick or CStick

    private static final double price = 5.00;

    public StickColor(String color, String stickType)
    {
        super("Stick Color", color);
        this.color = color;
        this.stickType = stickType;
    }

    // Getter
    public String getStickType() { return stickType; }

    @Override
    public double getPrice() { return price; }
}
