import Classes.CorporateHandbook;

public class Task02 {
    /*
        Пусть дан список сотрудников:
        - Иван Иванов;
        - Светлана Петрова;
        - Кристина Белова;
        - Анна Мусина;
        - Анна Крутова;
        - Иван Юрин;
        - Петр Лыков;
        - Павел Чернов;
        - Петр Чернышов;
        - Мария Федорова;
        - Марина Светлова;
        - Мария Савина;
        - Мария Рыкова;
        - Марина Лугова;
        - Анна Владимирова;
        - Иван Мечников;
        - Петр Петин;
        - Иван Ежов.

        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
     */


    public static void main(String[] args) {
        CorporateHandbook handbook = new CorporateHandbook();
        handbook.add("Иван Иванов");
        handbook.add("Светлана Петрова");
        handbook.add("Кристина Белова");
        handbook.add("Анна Мусина");
        handbook.add("Анна Крутова");
        handbook.add("Иван Юрин");
        handbook.add("Петр Лыков");
        handbook.add("Павел Чернов");
        handbook.add("Петр Чернышов");
        handbook.add("Мария Федорова");
        handbook.add("Марина Светлова");
        handbook.add("Мария Савина");
        handbook.add("Мария Рыкова");
        handbook.add("Марина Лугова");
        handbook.add("Анна Владимирова");
        handbook.add("Иван Мечников");
        handbook.add("Петр Петин");
        handbook.add("Иван Ежов");

        System.out.println(handbook);
    }
}
