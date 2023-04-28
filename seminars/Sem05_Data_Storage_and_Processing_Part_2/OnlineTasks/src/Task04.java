import java.util.*;

public class Task04 {
    /*
    Взять набор строк, например:

    "Мороз и солнце день чудесный
    Еще ты дремлешь друг прелестный
    Пора красавица проснись."

    Написать метод, который отсортирует слова по длине с помощью TreeMap.
    Строки с одинаковой длиной не должны “потеряться”.
     */

    public static void main(String[] args) {
        System.out.println(sort("Мороз и солнце день чудесный\n" +
                                        "Еще ты дремлешь друг прелестный\n" +
                                        "Пора красавица проснись."));
    }


    static String sort(String source) {
        String[] temp = source.replace("\n", " ")
                              .replace(".", "")
                              .split(" ");
        Map<Integer, List<String>> result = new TreeMap<>(Comparator.reverseOrder());

        for (String word :
                temp) {
            int key = word.length();
            if (result.containsKey(key)) {
                result.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                result.put(key, list);
            }
        }
        return result.toString();
    }
}
