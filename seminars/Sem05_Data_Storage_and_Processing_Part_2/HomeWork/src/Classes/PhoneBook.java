package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private final HashMap<String, String> phoneBook = new HashMap<>();

    private boolean dataAdding(String key, String value) {
        boolean reject = true;
        if (!phoneBook.containsKey(key)) {
            phoneBook.put(key, value);
            reject = false;
        }
        return reject;
    }

    private boolean dataUpdating(String key, String value) {
        boolean reject = true;
        if (phoneBook.containsKey(key)) {
            phoneBook.put(key, value);
            reject = false;
        }
        return reject;
    }

    private boolean dataDeleting(String key) {
        String previousValue = phoneBook.remove(key);
        return previousValue == null;
    }

    private String cleanPhoneNumber(String source) {
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[0-9]+?");
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            stringBuilder.append(source.subSequence(matcher.start(), matcher.end()));
        }
        return stringBuilder.toString();
    }

    public boolean add(String firstName, String lastName, String surname, String phoneNumber) {
        phoneNumber = cleanPhoneNumber(phoneNumber);
        return dataAdding(phoneNumber, String.format("%s %s %s", lastName, firstName, surname));
    }

    public boolean add(String firstName, String lastName, String phoneNumber) {
        phoneNumber = cleanPhoneNumber(phoneNumber);
        return dataAdding(phoneNumber, String.format("%s %s", lastName, firstName));
    }

    public boolean add(String someName, String phoneNumber) {
        phoneNumber = cleanPhoneNumber(phoneNumber);
        return dataAdding(phoneNumber, someName);
    }

    public boolean add(String phoneNumber) {
        phoneNumber = cleanPhoneNumber(phoneNumber);
        return dataAdding(phoneNumber, "");
    }


    @Override
    public String toString() {
        StringBuilder listBook = new StringBuilder();
        ArrayList<String> doubles = new ArrayList<>();
        for (String contactName: phoneBook.values()) {
            String cover = contactName.equals("") ? "Без имени" : contactName;
            if (!doubles.contains(cover)) {
                listBook.append(cover)
                        .append(":\n");
                for (Map.Entry<String, String> contactInfo : phoneBook.entrySet()) {
                    if (contactName.equals(contactInfo.getValue())) {
                        listBook.append("\t- ")
                                .append(contactInfo.getKey())
                                .append(";\n");
                    }
                }
                doubles.add(cover);
            }
        }

        return listBook.toString();
    }
}
