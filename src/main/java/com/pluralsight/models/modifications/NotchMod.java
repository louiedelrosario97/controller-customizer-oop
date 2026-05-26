package com.pluralsight.models.modifications;

import com.pluralsight.enums.StickSelect;

import static com.pluralsight.enums.SnapbackAxis.BOTH;
import static com.pluralsight.enums.StickSelect.C_STICK;
import static com.pluralsight.enums.StickSelect.JOYSTICK;

public class NotchMod extends Mod
{
    // NotchMod Characteristics
    private final StickSelect notchedTo;

    // Pricing Variables
    private static final double joyStickPrice = 45.00;
    private static final double cStickPrice = 45.00;
    private static final double bothPrice = 75.00;

    // Constructor
    public NotchMod(StickSelect notchedTo)
    {
        super("Stick Notch Mod (" + notchedTo + ")"); // IC!
        this.notchedTo = notchedTo;
    }

    // Getter(s)
    public StickSelect getNotchedTo() { return notchedTo; }

    @Override
    public double getPrice()
    {
        return switch (notchedTo)
        {
            case JOYSTICK -> joyStickPrice;
            case C_STICK -> cStickPrice;
            case BOTH -> bothPrice;
        };
    }
}

