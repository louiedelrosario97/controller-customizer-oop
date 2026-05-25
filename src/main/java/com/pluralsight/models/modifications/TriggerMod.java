package com.pluralsight.models.modifications;

public class TriggerMod extends Mod
{
    // Trigger Mod Characteristics
    private final String side;

    // Pricing variables
    private static final double leftPrice = 10.00;
    private static final double rightPrice = 10.00;
    private static final double bothPrice = 20.00;

    // Constructor
    public TriggerMod(String side)
    {
        super(side);
        this.side = side;
    }

    // Getter
    public String getSide() { return side; }

    @Override
    public double getPrice()
    {
        return switch (side.toLowerCase())
        {
            case "left" -> leftPrice;
            case "right" -> rightPrice;
            case "both" -> bothPrice;
            default -> 0.00;
        };
    }
}

