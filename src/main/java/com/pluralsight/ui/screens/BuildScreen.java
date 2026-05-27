package com.pluralsight.ui.screens;

import com.pluralsight.models.controller.BaseController;
import com.pluralsight.models.controller.Controller;
import com.pluralsight.models.cosmetics.ButtonSetColor;
import com.pluralsight.models.cosmetics.ShellColor;
import com.pluralsight.utilities.CatalogData;

import java.util.List;
import java.util.Scanner;

// This screen will guide through the custom-building of a controller. When completing the build,
// your custom 'controller' object is stored in List<Controller>.
public class BuildScreen
{
    private static Scanner scanner = new Scanner(System.in);

    public static void start()
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
        System.out.print("\n Custom paint your controller? (+$50) (Y/N): ");

        switch (scanner.nextLine().toUpperCase()) // IC!
        {
            case "Y": List<String> colors = CatalogData.getShellColor();
                System.out.println("\nColors Available:");
                for (int i = 0; i < colors.size(); i++)
                {
                    System.out.println((i + 1) + ") " + colors.get(i));
                }
                System.out.print("Select: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                controller.addCosmetic(new ShellColor(colors.get(choice - 1)));
                break;
            case "N":
                System.out.println("\nNo custom paint added.");
                break;
            default:  System.out.println("Input not valid. Please enter Y or N.");
                break;
        }
// -------------------------------------- [ Step 3: Button Set ] ------------------------------------------------------
        System.out.print("\n Change default buttons to a custom color set? (+$15) (Y/N):");

        switch (scanner.nextLine().toUpperCase())
        {
            case "Y": List<String> colors = CatalogData.getButtonSetColor();

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
    }

    // 4. Select custom joystick

    // 5. Select custom c-stick

    // 6. Select snapback mod

    // 7. Select TactileZMod
}

