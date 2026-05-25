package com.pluralsight.models.modifications;
// Snapback Capacitor Mod
public class SnapbackMod extends Mod
{
    // Snapback Characteristics
    private final String axis;

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
        return switch (axis.toLowerCase())
        {
            case "horizontal" -> horizontalPrice;
            case "vertical" -> verticalPrice;
            case "both" -> bothPrice;
            default -> 0.00;
        };
    }
}

