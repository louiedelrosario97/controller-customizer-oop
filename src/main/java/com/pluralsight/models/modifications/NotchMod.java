package com.pluralsight.models.modifications;

public class NotchMod extends Mod
{
    // Notch Characteristics
    private final String notchedTo;

    // Pricing Variables
    private static final double joyStickPrice = 45.00;
    private static final double cStickPrice = 45.00;
    private static final double bothPrice = 75.00;

    // Constructor
    public NotchMod(String name, String notchedTo)
    {
        super("Stick Notch Mod");
        this.notchedTo = notchedTo;
    }

    // Getter(s)
    public String getNotchedTo() { return notchedTo; }


    @Override
    public double getPrice()
    {
        return switch (notchedTo.toLowerCase())
        {
            case "joystick" -> joyStickPrice;
            case "c-stick" -> cStickPrice;
            case "both" -> bothPrice;
            default -> 0.00;
        };
    }
}

