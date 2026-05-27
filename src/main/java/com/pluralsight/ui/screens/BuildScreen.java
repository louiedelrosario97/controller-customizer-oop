package com.pluralsight.ui.screens;

import com.pluralsight.models.controller.BaseController;
import com.pluralsight.models.controller.Controller;
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

        // Step 1: Base Controller
        System.out.println("\n   Select base controller :");

        List<BaseController> bases = CatalogData.getBaseControllers();
        for (int i = 0; i < bases.size(); i++)
        {
            System.out.println((i + 1) + ") " + bases.get(i));
        }
        System.out.print("Select: ");
        int baseSelection = scanner.nextInt();

        BaseController base = bases.get(baseSelection - 1);

        Controller controller = new Controller(base);

        // 2: ShellColor
        System.out.println("\n Would you to custom paint your controller? (+$50) (Y/N): ");
        String input = scanner.nextLine();

        switch (input.toLowerCase())
        {
            case "y": List<String> colors = CatalogData.getShellColor();
            case "n":
        }
    }



    // 3. Select custom button set

    // 4. Select custom joystick

    // 5. Select custom c-stick

    // 6. Select snapback mod

    // 7. Select TactileZMod
}

