import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task04 {
    /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0-й позиции
    каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для
    заполнения данной структуры.


    [
        ["Фантастика", "Гари Поттер", "Ночной дозор"],
        ["Роман", "Война и мир", "Мастер и Маргарита"],
        ["Сказки", "Репка", "Колобок"],
        ["Детективы", "Шерлок Холмс", "Кто убил собаку"]
    ]
     */
    public static void main(String[] args) {
        List<List<String>> catalogue = new ArrayList<>();
        System.out.println(catalogue);
        addBook(catalogue, "Фентези", "Гари Поттер");
        addBook(catalogue, "Фантастика", "Ночной дозор");
        addBook(catalogue, "Роман", "Война и мир");
        addBook(catalogue, "Роман", "Мастер и Маргарита");
        addBook(catalogue, "Сказки", "Репка");
        addBook(catalogue, "Сказки", "Колобок");
        addBook(catalogue, "Детективы", "Шерлок Холмс");
        addBook(catalogue, "Детективы", "Кто убил собаку");
        System.out.println(catalogue);
    }

    static void addBook(List<List<String>> catalogue, String genre, String book) {
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).get(0).equals(genre)) {
                catalogue.get(i).add(book);
                return;
            }
        }
        List<String> list = new ArrayList<>(2);
        list.add(genre);
        list.add(book);
        catalogue.add(list);
    }
}
