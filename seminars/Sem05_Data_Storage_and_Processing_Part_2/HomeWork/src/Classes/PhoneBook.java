package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();


    private void dataAdding(String key, String value) {
        if (phoneBook.containsKey(key)) {
            phoneBook.get(key).add(value);
        } else {
            ArrayList<String> newPhoneList = new ArrayList<>();
            newPhoneList.add(value);
            phoneBook.put(key, newPhoneList);
        }
    }

    public void add(String firstName, String lastName, String surname, String phoneNumber) {
        dataAdding(String.format("%s %s %s", lastName, firstName, surname), phoneNumber);
    }


    public void add(String firstName, String lastName, String phoneNumber) {
        dataAdding(String.format("%s %s", lastName, firstName), phoneNumber);
    }


    public void add(String someName, String phoneNumber) {
        dataAdding(someName, phoneNumber);
    }


    @Override
    public String toString() {
        StringBuilder listBook = new StringBuilder();

        for (Map.Entry<String, ArrayList<String>> contact: phoneBook.entrySet()) {
            listBook.append(contact.getKey())
                    .append(":\n");
            for (String phoneNumber :
                    contact.getValue()) {
                listBook.append("\t")
                        .append(phoneNumber)
                        .append(";\n");
            }
        }

        return listBook.toString();
    }
}
