package com.pluralsight.models.modifications;

import static com.pluralsight.enums.SnapbackAxis.BOTH;
import static javax.swing.JSplitPane.LEFT;
import static javax.swing.JSplitPane.RIGHT;

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
            case LEFT -> leftPrice;
            case RIGHT -> rightPrice;
            case BOTH -> bothPrice;
            default -> 0.00;
        };
    }
}

