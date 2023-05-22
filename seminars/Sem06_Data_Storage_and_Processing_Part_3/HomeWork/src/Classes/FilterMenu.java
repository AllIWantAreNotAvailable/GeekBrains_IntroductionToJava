package Classes;

import java.util.HashMap;
import java.util.Map;

public class FilterMenu {
    private Map<Integer, String> menu;

    public FilterMenu() {
        this.menu = new HashMap<>();
        this.menu.put(1, "Filter by CPU");
        this.menu.put(2, "Filter by GPU");
        this.menu.put(3, "Filter by RAM");
        this.menu.put(4, "Filter by ROM");
        this.menu.put(5, "Filter by OS");
        this.menu.put(6, "Reset filters");
        this.menu.put(7, "Go back");
        this.menu.put(8, "Exit");
    }

    public Map<Integer, String> getMenu() {
        return menu;
    }

    public Object handler(Integer choice) {
        Object temp;
        switch (choice) {
            // Filter by CPU:
            case 1 -> temp = null;
            // Filter by GPU:
            case 2 -> temp = null;
            // Filter by RAM:
            case 3 -> temp = null;
            // Filter by ROM:
            case 4 -> temp = null;
            // Filter by OS:
            case 5 -> temp = null;
            // Reset filters:
            case 6 -> temp = -2;
            // Go back:
            case 7 -> temp = -1;
            // Exit without Exception:
            case 8 -> temp = 0;
            // Exit with Exception:
            default -> temp = 1;
        }
        return temp;
    }
}
