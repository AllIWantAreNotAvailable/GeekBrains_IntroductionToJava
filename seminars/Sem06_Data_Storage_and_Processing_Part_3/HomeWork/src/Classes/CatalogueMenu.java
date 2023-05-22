package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatalogueMenu {
    private Map<Integer, String> menu;

    public CatalogueMenu() {
        this.menu = new HashMap<>();
        this.menu.put(1, "Show full catalogue");
        this.menu.put(2, "Show some number of items");
        this.menu.put(3, "Go back");
        this.menu.put(4, "Exit");
    }

    public Map<Integer, String> getMenu() {
        return menu;
    }

    public Object handler(Integer choice) {
        Object temp;
        switch (choice) {
            // Show full catalogue:
            case 1 -> temp = getFullCatalogue();
            // Show some number of items:
            case 2 -> temp = getShortCatalogue();
            // Go back:
            case 3 -> temp = -1;
            // Exit without Exception:
            case 4 -> temp = 0;
            // Exit with Exception:
            default -> temp = 1;
        }
        return temp;
    }

    private RndLaptopList getFullCatalogue() {
        return new RndLaptopList(100,false);
    }

    private RndLaptopList getShortCatalogue() {
        Scanner scanner = new Scanner(System.in);
        String text = "How much should I show you";
        String introduction = "\n>>> ";
        System.out.printf("%s:%s", text, introduction);
        return new RndLaptopList(scanner.nextInt(),false);
    }

}
