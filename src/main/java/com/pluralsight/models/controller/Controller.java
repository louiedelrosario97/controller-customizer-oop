package com.pluralsight.models.controller;

import com.pluralsight.interfaces.IPriceable;
import com.pluralsight.models.modifications.Mod;
import com.pluralsight.models.cosmetics.Cosmetic;

import java.util.ArrayList;
import java.util.List;

public class Controller implements IPriceable
    // [Controller] Has-A BaseController, Has-A List of Parts, Has-A List of Mods, Has-A id to map to Order id
{
    // Controller Characteristics
    private final BaseController base;

    // Lists
    private List<Cosmetic> cosmetics;
    private List<Mod> mods;

    public Controller(BaseController base)
    {
        this.base = base;
        this.cosmetics = new ArrayList<>();
        this.mods = new ArrayList<>();
    }

    // Getters
    public BaseController getBase()  { return base; }
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
    public double getPrice()
    {
        double total = base.getPrice();
        for (Cosmetic cosmetic : cosmetics) { total += cosmetic.getPrice(); }
        for (Mod mod : mods)                { total += mod.getPrice(); }
        return total;                      // total = base + cosmetic + mod
    }

    @Override
    public String getDetails() // IC!
    {
        String details = "";
        details += "Base Controller (" + base.getName() + "): " + String.format("$%.2f", base.getPrice());

        for (Cosmetic cosmetic : cosmetics)
        { details += "\n   " + cosmetic.getName() + " (" + cosmetic.getColor() + "): " + String.format("$%.2f", cosmetic.getPrice()); }

        for (Mod mod : mods)
        { details += "\n   " + mod.getName() + ": " + String.format("$%.2f", mod.getPrice()); }

        details += "\n\n   Controller Total: " + String.format("$%.2f", getPrice()) + "\n";

        return details;
    }

    @Override
    public String toString() { return "\n◆─────────────[ Base Controller: " + base.getName() + " ]─────────────◆"; }
}


