package com.pluralsight.models.controller;

import com.pluralsight.models.modifications.Mod;
import com.pluralsight.models.cosmetics.Cosmetic;

import java.util.ArrayList;
import java.util.List;

public class Controller
    // [Controller] Has-A BaseController, Has-A List of Parts, Has-A List of Mods, Has-A id to map to Order id
{
    // Controller Characteristics
    private final BaseController base;
//    private final int id;----------------------------- TODO create id logic later

    // Lists
    private List<Cosmetic> cosmetics;
    private List<Mod> mods;

    public Controller(BaseController base)
    {
//        this.id = id;----------------------------- TODO create id logic later
        this.base = base;
        this.cosmetics = new ArrayList<>();
        this.mods = new ArrayList<>();
    }

    // Getters
    public BaseController getBase()  { return base; }
//  public int getId()---------------{ return id; }----------------------------- TODO create id logic later
    public List<Cosmetic> getParts() { return cosmetics; }
    public List<Mod> getMods()       { return mods; }

    // Add Methods
    public void addCosmetic(Cosmetic cosmetic)
    {
        cosmetics.add(cosmetic);
    }

    public void addMod(Mod mod)
    {
        mods.add(mod);
    }

    // (Derived Getter) Gets total cost of controller once it is created after a build.
    public double getTotal()
    {
        double total = base.getPrice();

        for (Cosmetic cosmetic : cosmetics) { total += cosmetic.getPrice(); }

        for (Mod mod : mods)                { total += mod.getPrice(); }

        return total;                      // total = base + cosmetic + mod
    }
}


