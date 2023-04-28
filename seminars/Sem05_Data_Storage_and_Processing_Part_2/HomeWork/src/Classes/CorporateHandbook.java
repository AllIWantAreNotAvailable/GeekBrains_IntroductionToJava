package Classes;

import java.util.*;

public class CorporateHandbook {
    private ArrayList<String> handbook = new ArrayList<>();

    public void add(String fullName) {
        handbook.add(fullName);
    }


    @Override
    public String toString() {
        Map<Integer, ArrayList<String>> popularNames = new TreeMap<>(Comparator.reverseOrder());

        for (String fullName : handbook) {
            int counter = 0;
            String firstName = fullName.split(" ")[0];
            for (String temp : handbook) {
                String spam = temp.split(" ")[0];
                if (firstName.equals(spam)) {
                    counter++;
                }
            }
            if (popularNames.containsKey(counter)) {
                ArrayList<String> names = popularNames.get(counter);
                if (!names.contains(firstName)) {
                    names.add(firstName);
                }
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(firstName);
                popularNames.put(counter, temp);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int place = 0;
        for (Map.Entry<Integer, ArrayList<String>> element : popularNames.entrySet()) {
            stringBuilder.append(++place).append(". ");
            for (String name : element.getValue()) {
                stringBuilder.append(name).append(", ");
            }
            int startIndex = stringBuilder.length() - 2;
            int stopIndex = stringBuilder.length();
            stringBuilder.replace(startIndex, stopIndex, String.format(" => по %d каждого\n", element.getKey()));
        }


        return stringBuilder.toString();
    }
}
