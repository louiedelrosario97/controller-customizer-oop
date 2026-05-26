package com.pluralsight.models.modifications;

import static com.pluralsight.enums.SnapbackAxis.*;

// Snapback Capacitor Mod
public class SnapbackMod extends Mod
{
    // Snapback Characteristics
    private String axis;

    // Pricing variables
    private static final double horizontalPrice = 50.00;
    private static final double verticalPrice = 50.00;
    private static final double bothPrice = 75.00;

    public SnapbackMod(String axis)
    {
        super("Snapback Capacitor Mod");
        this.axis = axis;
    }

    public String getAxis() { return axis; }

    @Override
    public double getPrice() {
        return switch (axis)
        {
            case HORIZONTAL -> horizontalPrice;
            case VERTICAL -> verticalPrice;
            case BOTH -> bothPrice;
            default -> 0.00;
        };
    }
}

