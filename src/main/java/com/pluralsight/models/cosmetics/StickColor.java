package com.pluralsight.models.cosmetics;

import com.pluralsight.enums.StickSelect;

public class StickColor extends Cosmetic
{
    // Enum as a field type ( Guarantees valid enum values are stored )
    private final StickSelect stickSelect;

    private static final double price = 5.00;

    public StickColor(String color, StickSelect stickSelect)
    {
        super("Stick Color", color);
        this.color = color;
        this.stickSelect = stickSelect;
    }

    // Getter
    public StickSelect getStickSelect() { return stickSelect; }

    @Override
    public double getPrice() { return price; }
}
