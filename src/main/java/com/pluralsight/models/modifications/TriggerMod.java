package com.pluralsight.models.modifications;

public class TriggerMod extends Mod
{
    // Trigger Mod Characteristics
    private final String bumper;

    // Pricing variables
    private static final double leftPrice = 10.00;
    private static final double rightPrice = 10.00;
    private static final double bothPrice = 20.00;

    // Constructor
    public TriggerMod(String side)
    {
        super(side);
        this.bumper = side;
    }

    // Getter
    public String getBumper() { return bumper; }

    @Override
    public double getPrice()
    {
        return switch (bumper.toLowerCase())
        {
            case "left" -> leftPrice;
            case "right" -> rightPrice;
            case "both" -> bothPrice;
            default -> 0.00;
        };
    }
}

