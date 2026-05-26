package com.pluralsight.models.modifications;

import com.pluralsight.enums.BumperSide;

public class TriggerMod extends Mod
{
    // Trigger Mod Characteristics
    private final BumperSide bumper;

    // Pricing variables
    private static final double leftPrice = 10.00;
    private static final double rightPrice = 10.00;
    private static final double bothPrice = 20.00;

    // Constructor
    public TriggerMod(BumperSide bumper)
    {
        super("Trigger Mod(" + bumper + ")");
        this.bumper = bumper;
    }

    // Getter
    public BumperSide getBumper() { return bumper; }

    @Override
    public double getPrice()
    {
        return switch (bumper)
        {
            case LEFT -> leftPrice;
            case RIGHT -> rightPrice;
            case BOTH -> bothPrice;
        };
    }
}

