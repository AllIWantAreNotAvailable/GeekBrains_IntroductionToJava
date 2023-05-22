package Classes;


import java.util.*;

public class UserDialog {
    private LinkedList<Object> queue;
    private List<Laptop> catalogue;
    private List<Laptop> temp;

    String introduction;

    public UserDialog() {
        this.queue = new LinkedList<>();
        this.queue.add(new MainMenu());
        this.catalogue = null;
        this.temp = null;
        this.introduction = ">>> ";

        // Instructions:
        System.out.println("To work with the menu, enter the command number.");
    }

    public void startDialog() {
        while (0 < this.queue.size()) {
            Object current = this.queue.getLast();
            Object response = null;

            if (current instanceof MainMenu) {
                response = sendRequest((MainMenu) current);
            } else if (current instanceof CatalogueMenu) {
                response = sendRequest((CatalogueMenu) current);
            } else if (current instanceof FilterMenu) {
                response = sendRequest((FilterMenu) current);
            }
            System.out.println();

            if (response instanceof Integer running) {
                switch (running) {
                    case -1 -> this.queue.removeLast();
                    case 0 -> this.queue.clear();
                    case 1 -> System.out.println("No such command Exception... try again.");
                    case -2 -> {
                        if (this.catalogue.size() < this.temp.size()) this.catalogue = this.temp;
                        if (this.catalogue != null) showCatalogue();
                    }
                }
            } else if (response instanceof RndLaptopList) {
                if (this.temp == null) {
                    this.temp = ((RndLaptopList) response).getRandomList();
                }
                this.catalogue = ((RndLaptopList) response).getRandomList();
                showCatalogue();
            } else {
                current = response;
                this.queue.add(current);
            }
        }
    }

    private void showCatalogue() {
        StringBuilder stringBuilder = new StringBuilder();
        int increment = 0;
        for (Laptop laptop : this.catalogue) {
            stringBuilder.append(String.format("%d) ", ++increment))
                    .append(laptop)
                    .append("\n");
        }
        System.out.println(stringBuilder);
    }

    private Object sendRequest(MainMenu request) {
        Scanner scanner = new Scanner(System.in);
        String menu = showDialog(request.getMenu());
        System.out.println(menu);
        System.out.printf("%s", this.introduction);
        return request.handler(scanner.nextInt());
    }

    private Object sendRequest(CatalogueMenu request) {
        Scanner scanner = new Scanner(System.in);
        String menu = showDialog(request.getMenu());
        System.out.println(menu);
        System.out.printf("%s", this.introduction);
        return request.handler(scanner.nextInt());
    }

    private Object sendRequest(FilterMenu request) {
        Scanner scanner = new Scanner(System.in);
        String menu = showDialog(request.getMenu());
        System.out.println(menu);
        System.out.printf("%s", this.introduction);
        return request.handler(scanner.nextInt());
    }

    private String showDialog(Map<Integer, String> menu) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, String> item : menu.entrySet()) {
            stringBuilder.append(String.format("\n%s. %s", item.getKey(), item.getValue()));
        }
        return stringBuilder.toString();
    }
}
