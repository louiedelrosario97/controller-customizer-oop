package com.pluralsight.models.parts;

public class AnalogStick extends Part
{
    private String stickType; // Joystick or CStick



    public AnalogStick(String name, String color)
    {
        super(name, color);
    }

    // Getters
    public String getStickType() { return stickType; }
}

