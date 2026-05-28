package com.pluralsight.ui.screens;

import com.pluralsight.enums.BumperSide;
import com.pluralsight.enums.SnapbackAxis;
import com.pluralsight.enums.StickSelect;
import com.pluralsight.models.controller.BaseController;
import com.pluralsight.models.controller.Controller;
import com.pluralsight.models.cosmetics.ButtonSetColor;
import com.pluralsight.models.cosmetics.ShellColor;
import com.pluralsight.models.cosmetics.StickColor;
import com.pluralsight.models.modifications.NotchMod;
import com.pluralsight.models.modifications.SnapbackMod;
import com.pluralsight.models.modifications.TactileZMod;
import com.pluralsight.models.modifications.TriggerMod;
import com.pluralsight.utilities.CatalogData;

import java.util.List;
import java.util.Scanner;

// This screen will guide through the custom-building of a controller. When
// completing the build, your custom 'controller' object is stored in start().
public class DesignScreen
{
    private static Scanner scanner = new Scanner(System.in);

    public static Controller start()
    {
        IO.println("\n   Build Your Controller   ");
        IO.println("------------------------------");

// -------------------------------------- [ Step 1: Base Controller ] -------------------------------------------------
        IO.println("\n[ Select Base Controller ]");

        List<BaseController> bases = CatalogData.getBaseControllers();
        for (int i = 0; i < bases.size(); i++)
        {
            IO.println((i + 1) + ") " + bases.get(i));
        }
        IO.print("Select: ");
        int baseSelection = scanner.nextInt();
        scanner.nextLine();

        BaseController base = bases.get(baseSelection - 1);

        Controller controller = new Controller(base);

// -------------------------------------- [ Step 2: Shell Color ] -----------------------------------------------------
        boolean runningLoop = true;
        while(runningLoop)
        {
            IO.println("\n[ Paint Your Controller ]");
            IO.println("Y) Customize Paint (+$50)");
            IO.println("N) No Paint");
            IO.print("Select: ");
            switch (scanner.nextLine().toUpperCase()) // IC!
            {
                case "Y":
                    List<String> colors = CatalogData.getShellColor();
                    IO.println("\nColors Available:");
                    for (int i = 0; i < colors.size(); i++) {
                        IO.println((i + 1) + ") " + colors.get(i));
                    }
                    IO.print("Select: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    controller.addCosmetic(new ShellColor(colors.get(choice - 1)));
                    runningLoop = false;
                    break;

                case "N": IO.println("\nNo custom paint added."); runningLoop = false; break;
                default:  IO.println("Input not valid. Please enter Y or N.");         break;
            }
        }
// -------------------------------------- [ Step 3: Button Set ] ------------------------------------------------------
        runningLoop = true;
        while (runningLoop)
        {
            IO.println("\n[ Button Color Sets ]");
            IO.println("Y) Customize Buttons (+$15)");
            IO.println("N) Default Buttons");
            IO.print("Select: ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    List<String> colors = CatalogData.getButtonSetColor();
                    IO.println("\n Colors Available:");
                    for (int i = 0; i < colors.size(); i++)
                    {
                        IO.println((i + 1) + ") " + colors.get(i));
                    }
                    IO.print("Select: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    controller.addCosmetic(new ButtonSetColor(colors.get(choice - 1)));
                    runningLoop = false;
                    break;

                case "N":  IO.println("No custom button set added."); runningLoop = false; break;
                default:  IO.println("Input not valid. Please enter Y or N."); break;
            }
        }
// -------------------------------------- [ Step 4: Joystick Color ] --------------------------------------------------
        runningLoop = true;
        while (runningLoop) {
            IO.print("\nWould you like a custom joystick color? (+$5) (Y/N): ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    List<String> colors = CatalogData.getStickColor();
                    IO.println("Colors Available:");
                    for (int i = 0; i < colors.size(); i++)
                    {
                        IO.println((i + 1) + ") " + colors.get(i));
                    }
                    IO.print("Select: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    controller.addCosmetic(new StickColor(colors.get(choice - 1), StickSelect.JOYSTICK));
                    runningLoop = false;
                    break;
                case "N":
                    IO.println("No custom joystick color added.");
                    runningLoop = false;
                    break;
                default:
                    IO.println("Input not valid. Please enter Y or N.");
                    break;
            }
        }
// -------------------------------------- [ Step 5: C-Stick Color ] --------------------------------------------------
        runningLoop = true;                                                     
        while (runningLoop) {                                                   
            IO.print("\nWould you like a custom C-stick color? (+$5) (Y/N): ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    List<String> colors = CatalogData.getStickColor();
                    IO.println("Colors Available:");
                    for (int i = 0; i < colors.size(); i++) {
                        IO.println((i + 1) + ") " + colors.get(i));
                    }
                    IO.print("Select: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    controller.addCosmetic(new StickColor(colors.get(choice - 1), StickSelect.C_STICK));
                    runningLoop = false;                                         
                    break;
                case "N":
                    IO.println("No custom C-stick color added.");
                    runningLoop = false;                                         
                    break;
                default:
                    IO.println("Input not valid. Please enter Y or N.");
                    break;
            }
        }
// -------------------------------------- [ Step 6: Snapback Mod ] ----------------------------------------------------
        runningLoop = true;                                                     
        while (runningLoop)
        {                                                   
            IO.print("\nWould you like a Snapback Mod? (Y/N): ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    IO.println("1) Horizontal ($50)");
                    IO.println("2) Vertical ($50)");
                    IO.println("3) Both ($75)");
                    IO.print("Select: ");
                    switch (scanner.nextLine().trim())
                    {
                        case "1": controller.addMod(new SnapbackMod(SnapbackAxis.HORIZONTAL)); break;
                        case "2": controller.addMod(new SnapbackMod(SnapbackAxis.VERTICAL));   break;
                        case "3": controller.addMod(new SnapbackMod(SnapbackAxis.BOTH));       break;
                    }
                    runningLoop = false;                                         
                    break;
                case "N":
                    IO.println("\nNo snapback mod added.");
                    runningLoop = false;                                         
                    break;
                default:
                    IO.println("Input not valid. Please enter Y or N.");
                    break;
            }
        }
// -------------------------------------- [ Step 7: TactileZ Mod ] ----------------------------------------------------
        runningLoop = true;                                                     
        while (runningLoop) {                                                   
            IO.print("\nWould you like a tactile Z button mod? (+$30) (Y/N): ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    controller.addMod(new TactileZMod());
                    IO.println("Tactile Z mod added!");
                    runningLoop = false;                                         
                    break;
                case "N":
                    IO.println("No tactile Z mod added.");
                    runningLoop = false;                                         
                    break;
                default:
                    IO.println("Input not valid. Please enter Y or N.");
                    break;
            }
        }

// -------------------------------------- [ Step 8: Notch Mod ] -------------------------------------------------------
        runningLoop = true;                                                     
        while (runningLoop) {                                                   
            IO.print("\n Would you like notch mods? (Y/N): ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    IO.println("1) Joystick only ($45)");
                    IO.println("2) C-stick only ($45)");
                    IO.println("3) Both ($75)");
                    IO.print("Select: ");
                    switch (scanner.nextLine().trim())
                    {
                        case "1": controller.addMod(new NotchMod(StickSelect.JOYSTICK)); break;
                        case "2": controller.addMod(new NotchMod(StickSelect.C_STICK));  break;
                        case "3": controller.addMod(new NotchMod(StickSelect.BOTH));     break;
                        default:  IO.println("\n Invalid input. Try again.");            break;
                    }
                    runningLoop = false;                                         
                    break;
                case "N":
                    IO.println("No notch mod added.");
                    runningLoop = false;                                         
                    break;
                default:
                    IO.println("\nInvalid input. Try again.");
                    break;
            }
        }
// -------------------------------------- [ Step 9: Trigger Mod ] -----------------------------------------------------
        runningLoop = true;                                                     
        while (runningLoop) {                                                   
            IO.print("\n Would you like trigger mods? (Y/N): ");
            switch (scanner.nextLine().toUpperCase())
            {
                case "Y":
                    IO.println("Apply mod to which trigger?");
                    IO.println("\n1) Left Trigger");
                    IO.println("2) Right Trigger");
                    IO.println("3) Both");
                    IO.println("Select: ");
                    switch (scanner.nextLine().trim())
                    {
                        case "1": controller.addMod(new TriggerMod(BumperSide.LEFT));  break;
                        case "2": controller.addMod(new TriggerMod(BumperSide.RIGHT)); break;
                        case "3": controller.addMod(new TriggerMod(BumperSide.BOTH));  break;
                        default:  IO.println("\n Invalid input. Try again.");          break;
                    }
                    runningLoop = false;                                         
                    break;
                case "N":
                    IO.println("No trigger mod added.");
                    runningLoop = false;                                         
                    break;
                default:
                    IO.println("\n Invalid input. Try again.");
                    break;
            }
        }
        // Return to start()
        return controller;
    }
}

