import Classes.PhoneBook;

public class Task01 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Иван", "+7 (999) 999-99-99");
        myPhoneBook.add("Иван", "+7 (999) 999-99-98");
        myPhoneBook.add("Иван", "+7 (999) 999-99-97");
        myPhoneBook.add("Иван", "+7 (999) 999-99-96");
        myPhoneBook.add("Петр", "Петров", "+7 (999) 999-99-95");
        myPhoneBook.add("Петр", "Петров", "+7 (999) 999-99-94");
        myPhoneBook.add("Петр", "Петров", "+7 (999) 999-99-93");
        myPhoneBook.add("Петр", "Петров", "+7 (999) 999-99-92");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "+7 (999) 999-99-91");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "+7 (999) 999-99-90");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "+7 (999) 999-99-89");
        myPhoneBook.add("Иван", "Иванов", "Иванович", "+7 (999) 999-99-87");
        myPhoneBook.add("+7 (999) 999-99-86");
        myPhoneBook.add("+7 (999) 999-99-85");
        myPhoneBook.add("+7 (999) 999-99-84");
        System.out.println(myPhoneBook);
    }
}