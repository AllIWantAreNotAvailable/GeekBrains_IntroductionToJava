import Classes.PhoneBook;

public class Task01 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Иван", "12345678901");
        myPhoneBook.add("Иван", "11234567890");
        myPhoneBook.add("Иван", "01123456789");
        myPhoneBook.add("Иван", "90112345678");
        myPhoneBook.add("Иван", "Иванов", "12345678901");
        myPhoneBook.add("Иван", "Иванов", "11234567890");
        myPhoneBook.add("Иван", "Иванов", "01123456789");
        myPhoneBook.add("Иван", "Иванов", "90112345678");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "12345678901");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "11234567890");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "01123456789");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "90112345678");
        System.out.println(myPhoneBook);
    }
}