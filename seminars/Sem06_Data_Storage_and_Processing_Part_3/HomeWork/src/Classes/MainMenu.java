package Classes;

import java.util.HashMap;
import java.util.Map;

public class MainMenu {
    private Map<Integer, String> menu;

    public MainMenu() {
        this.menu = new HashMap<>();
        this.menu.put(1, "Show catalogue");
        this.menu.put(2, "Filter");
        this.menu.put(3, "Exit");
    }

    public Map<Integer, String> getMenu() {
        return menu;
    }

    public Object handler(Integer choice) {
        Object temp;
        switch (choice) {
            // Show catalogue:
            case 1 -> temp = new CatalogueMenu();
            // Filter:
            case 2 -> temp = new FilterMenu();
            // Exit without Exception:
            case 3 -> temp = 0;
            // Exit with Exception:
            default -> temp = 1;
        }
        return temp;
    }

}
