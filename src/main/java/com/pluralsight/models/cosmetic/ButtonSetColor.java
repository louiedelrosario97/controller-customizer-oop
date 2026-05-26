package com.pluralsight.models.cosmetic;

public class ButtonSetColor extends Cosmetic
{
    private final String setColor;

    // Pricing variable
    private static final double price = 15.00;

    // Constructor
    public ButtonSetColor(String setColor)
    {
        super("Button Set", setColor);
        this.setColor = setColor;
    }

    // Getter
    public String getColorSet() { return setColor; }

    @Override
    public double getPrice() { return price; }
}



