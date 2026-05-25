package com.pluralsight.models.modifications;
// Snapback Capacitor Mod
public class SnapbackMod extends Mod
{
    private String axis;

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
        switch (axis.toLowerCase())
        {
            case "horizontal":
                return horizontalPrice;
            case "vertical":
                return verticalPrice;
            case "both":
                return bothPrice;
            default:
                return 0.00;
        }
    }
}

