package com.pluralsight.utilities;

import com.pluralsight.models.controller.BaseController;
import com.pluralsight.models.cosmetics.ShellColor;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(baseControllers);
        return baseControllers;
    }

    // ShellColor options
    public static List<ShellColor> getShellColor()
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
    }
}

