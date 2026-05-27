package com.pluralsight.utilities;

import com.pluralsight.models.controller.BaseController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// For every purchasable option that has 2 or more choices, we will store those choices in a List<>.
// This class will hold all available options as static Lists so the UI is easier to navigate and make changes.
public class CatalogData

{
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
}

