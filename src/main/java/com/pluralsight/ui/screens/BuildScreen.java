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

// This screen will guide through the custom-building of a controller. When completing the build,
// your custom 'controller' object is stored in start().
public class BuildScreen
{
    private static Scanner scanner = new Scanner(System.in);

    public static Controller start()
    {
        System.out.println("\n   Design Your Controller   ");
        System.out.println("----------------------------------");

// -------------------------------------- [ Step 1: Base Controller ] -------------------------------------------------
        System.out.println("\n   Select base controller :");

        List<BaseController> bases = CatalogData.getBaseControllers();
        for (int i = 0; i < bases.size(); i++)
        {
            System.out.println((i + 1) + ") " + bases.get(i));
        }
        System.out.print("Select: ");
        int baseSelection = scanner.nextInt();
        scanner.nextLine();

        BaseController base = bases.get(baseSelection - 1);

        Controller controller = new Controller(base);

// -------------------------------------- [ Step 2: Shell Color ] -----------------------------------------------------
        System.out.print("\nCustom paint your controller? (+$50) (Y/N): ");

        switch (scanner.nextLine().toUpperCase()) // IC!
        {
            case "Y":
                List<String> colors = CatalogData.getShellColor();
                System.out.println("\nColors Available:");
                for (int i = 0; i < colors.size(); i++)
                {
                    System.out.println((i + 1) + ") " + colors.get(i));
                }
                System.out.print("Select: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                controller.addCosmetic(new ShellColor(colors.get(choice - 1)));    break;
            case "N":  System.out.println("\nNo custom paint added.");             break;
            default:  System.out.println("Input not valid. Please enter Y or N."); break;
        }
// -------------------------------------- [ Step 3: Button Set ] ------------------------------------------------------
        System.out.print("\nChange default buttons to a custom color set? (+$15) (Y/N):");

        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                List<String> colors = CatalogData.getButtonSetColor();
                System.out.println("\n Colors Available:");
                for (int i = 0; i < colors.size(); i++)
                {
                    System.out.println((i + 1) + ") " + colors.get(i));
                }
                System.out.print("Select: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                controller.addCosmetic(new ButtonSetColor(colors.get(choice - 1))); break;

            case "N": System.out.println("No custom button set added.");            break;
            default:  System.out.println("Input not valid. Please enter Y or N.");  break;
        }
// -------------------------------------- [ Step 4: Joystick Color ] --------------------------------------------------
        System.out.print("\nWould you like a custom joystick color? (+$5) (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                List<String> colors = CatalogData.getStickColor();
                System.out.println("Colors Available:");
                for (int i = 0; i < colors.size(); i++)
                {
                    System.out.println((i + 1) + ") " + colors.get(i));
                }
                System.out.print("Select: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                controller.addCosmetic(new StickColor(colors.get(choice - 1), StickSelect.JOYSTICK)); break;

            case "N": System.out.println("No custom joystick color added.");                          break;
            default:  System.out.println("Input not valid. Please enter Y or N.");                    break;
        }
// -------------------------------------- [ Step 5: C-Stick Color ] --------------------------------------------------
        System.out.print("\nWould you like a custom C-stick color? (+$5) (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                List<String> colors = CatalogData.getStickColor();
                System.out.println("Colors Available:");
                for (int i = 0; i < colors.size(); i++) {
                    System.out.println((i + 1) + ") " + colors.get(i));
                }
                System.out.print("Select: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                controller.addCosmetic(new StickColor(colors.get(choice - 1), StickSelect.C_STICK)); break;

            case "N":  System.out.println("No custom C-stick color added.");                         break;
            default:  System.out.println("Input not valid. Please enter Y or N.");                   break;
        }
// -------------------------------------- [ Step 6: Snapback Mod ] ----------------------------------------------------
        System.out.print("\nWould you like a Snapback Mod? (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                System.out.println("1) Horizontal ($50)");
                System.out.println("2) Vertical ($50)");
                System.out.println("3) Both ($75)");
                System.out.print("Select: ");

                switch (scanner.nextLine().trim())
                {
                    case "1": controller.addMod(new SnapbackMod(SnapbackAxis.HORIZONTAL)); break;
                    case "2": controller.addMod(new SnapbackMod(SnapbackAxis.VERTICAL));   break;
                    case "3": controller.addMod(new SnapbackMod(SnapbackAxis.BOTH));       break;
                }
                break;

            case "N": System.out.println("\nNo snapback mod added.");              break;
            default:  System.out.println("Input not valid. Please enter Y or N."); break;
        }
// -------------------------------------- [ Step 7: TactileZ Mod ] ----------------------------------------------------
        System.out.print("\nWould you like a tactile Z button mod? (+$30) (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                controller.addMod(new TactileZMod());
                System.out.println("Tactile Z mod added!");                        break;

            case "N":  System.out.println("No tactile Z mod added.");              break;
            default:  System.out.println("Input not valid. Please enter Y or N."); break;
        }

// -------------------------------------- [ Step 8: Notch Mod ] -------------------------------------------------------
        System.out.print("\n Would you like notch mods? (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
                System.out.println("1) Joystick only ($45)");
                System.out.println("2) C-stick only ($45)");
                System.out.println("3) Both ($75)");
                System.out.print("Select: ");
                switch (scanner.nextLine().trim())
                {
                    case "1":  controller.addMod(new NotchMod(StickSelect.JOYSTICK)); break;
                    case "2":  controller.addMod(new NotchMod(StickSelect.C_STICK));  break;
                    case "3":  controller.addMod(new NotchMod(StickSelect.BOTH));     break;
                    default: System.out.println("\n Invalid input. Try again.");      break;
                }
                break;
            case "N": System.out.println("No notch mod added.");         break;
            default:  System.out.println("\nInvalid input. Try again."); break;
        }
// -------------------------------------- [ Step 9: Trigger Mod ] -----------------------------------------------------
        System.out.print("\n Would you like trigger mods? (Y/N): ");
        switch (scanner.nextLine().toUpperCase())
        {
            case "Y":
               System.out.println("Apply mod to which trigger?");
               System.out.println("\n1) Left Trigger");
               System.out.println("2) Right Trigger");
               System.out.println("3) Both");
               System.out.println("Select: ");
               switch (scanner.nextLine().trim())
               {
                   case "1": controller.addMod(new TriggerMod(BumperSide.LEFT));  break;
                   case "2": controller.addMod(new TriggerMod(BumperSide.RIGHT)); break;
                   case "3": controller.addMod(new TriggerMod(BumperSide.BOTH));  break;
                   default: System.out.println("\n Invalid input. Try again.");   break;
               }
               break;
            case "N": System.out.println("No trigger mod added.");        break;
            default:  System.out.println("\n Invalid input. Try again."); break;

        }
        // Return to start()
        return controller;
    }
}

