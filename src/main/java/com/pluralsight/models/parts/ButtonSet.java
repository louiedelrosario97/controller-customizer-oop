package com.pluralsight.models.parts;

public class ButtonSet extends Part
{
    private final String setColor;

    // Pricing variable
    private static final double price = 15.00;

    // Constructor
    public ButtonSet(String setColor)
    {
        super("Button Set", setColor);
        this.setColor = setColor;
    }

    // Getter
    public String getColorSet() { return setColor; }

    @Override
    public double getPrice() { return price; }
}



