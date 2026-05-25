package com.pluralsight.models.controller;

import com.pluralsight.models.modifications.Mod;
import com.pluralsight.models.parts.Part;

import java.util.List;

public class Controller
    // Has-A BaseController, Has-A List of Parts, Has-A List of Mods
{
    // Variables
    private List<Part> parts;
    private List<Mod> mods;
    private String BaseController;
}

