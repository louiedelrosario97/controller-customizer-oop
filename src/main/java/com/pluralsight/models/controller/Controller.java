package com.pluralsight.models.controller;

import com.pluralsight.models.modifications.Mod;
import com.pluralsight.models.parts.Part;

import java.util.ArrayList;
import java.util.List;

public class Controller
    // [Controller] Has-A BaseController, Has-A List of Parts, Has-A List of Mods, Has-A id to map to Order id
{
    // Controller Characteristics
    private final BaseController base;
    private final int id;

    // Lists (Blueprint)
    private List<Part> parts;
    private List<Mod> mods;

    public Controller(BaseController base, int id)
    {
        this.id = id;
        this.base = base;
        this.parts = new ArrayList<>();
        this.mods = new ArrayList<>();
    }

    // Getters
    public BaseController getBase() { return base; }
    public int getId() { return id; }
    public List<Part> getParts() { return parts; }
    public List<Mod> getMods() { return mods; }

    // Derived Getters
    public double getCost()
    {
        double cost = 0;
        cost += base.getPrice();
        // Add rest of logic later ~
        return cost;
    }
}

