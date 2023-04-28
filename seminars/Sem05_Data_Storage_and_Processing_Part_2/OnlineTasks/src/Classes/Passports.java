package Classes;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> passports = new HashMap<>();


    public void add(String uuid, String lastName) {
        passports.put(uuid, lastName);
    }


    public String get(String uuid) {
        return String.format("%s: %s", uuid, passports.get(uuid));
    }


    public String getByLN(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> element:
             passports.entrySet()) {
            if (lastName.equals(element.getValue())) {
                stringBuilder.append(String.format("%s: %s\n", element.getKey(), element.getValue()));
            }
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("Не найдено записей.");
        }
        return stringBuilder.toString();
    }


    public String getList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> element:
                passports.entrySet()) {
            stringBuilder.append(String.format("%s: %s\n", element.getKey(), element.getValue()));
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("Не найдено записей.");
        }
        return stringBuilder.toString();
    }
}
