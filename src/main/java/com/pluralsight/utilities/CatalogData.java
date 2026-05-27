package com.pluralsight.utilities;

import com.pluralsight.models.accessory.Accessory;
import com.pluralsight.models.controller.BaseController;
import com.pluralsight.models.cosmetics.ShellColor;
import com.pluralsight.models.cosmetics.StickColor;

import java.util.ArrayList;
import java.util.List;

// For every purchasable option that has 2 or more choices, we will store those choices in a List<>.
// This class will hold all available options as static Lists so the UI is easier to navigate and make changes.
public class CatalogData

{   // BaseController options
    public static List<BaseController> getBaseControllers()
    {
        List<BaseController> baseControllers = new ArrayList<>();

        baseControllers.add(new BaseController("Indigo (Original)",45.00));
        baseControllers.add(new BaseController("Smash4 Black",     65.00));
        baseControllers.add(new BaseController("Smash4 White",    100.00));
        baseControllers.add(new BaseController("New Ultimate",     50.00));
        return baseControllers;
    }

    // ShellColor options
    public static List<String> getShellColor()
    {
        List<String> colors = new ArrayList<>(); // IC!
        colors.add("Matte Black");
        colors.add("Crimson Red");
        colors.add("Soft Pink");
        colors.add("Wintergreen");
        colors.add("Violet");
        colors.add("Royal Blue");
        colors.add("Brown");
        colors.add("Silver");
        colors.add("Taxi Yellow");
        return colors;
    }

    // StickColor options
    public static List<String> getStickColor()
    {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        return colors;
    }

    // ButtonSetColor options
    public static List<String> getButtonSetColor()
    {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Iridescent");
        colors.add("Solid Green");
        colors.add("Solid Red");
        colors.add("Solid Purple");
        colors.add("Transparent Green");
        colors.add("Transparent Red");
        colors.add("Transparent Purple");
        return colors;
    }

    public static List<Accessory> getAccessory()
    {
        List<Accessory> accessories = new ArrayList<>();
        accessories.add(new Accessory("Carrying Case",    25.00));
        accessories.add(new Accessory("Controller Stand", 15.00));
        return accessories;
    }
}

