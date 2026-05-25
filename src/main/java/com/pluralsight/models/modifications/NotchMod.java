package com.pluralsight.models.modifications;

public class NotchMod extends Mod
{
    private String notchedTo;

    private static final double joyStickPrice = 45.00;
    private static final double cStickPrice = 45.00;
    private static final double bothPrice = 75.00;



    public NotchMod(String name, String notchedTo)
    {
        super("Stick Notch Mod");
        this.notchedTo = notchedTo;
    }

    public String getNotchedTo() {
        return notchedTo;
    }

    @Override
    public double getPrice() {
        switch (notchedTo.toLowerCase())
        {
            case "joystick":
                return joyStickPrice;
            case "c-stick":
                return cStickPrice;
            case "both":
                return bothPrice;
            default:
                return 0.00;
        }
    }
}

