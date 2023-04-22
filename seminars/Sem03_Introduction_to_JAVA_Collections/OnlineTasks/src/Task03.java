import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Task03 {
    /*
    Создать список типа ArrayList
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа.
     */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(4);
        list.add("15");
        list.add("Привет");
        list.add(77);
        list.add(5);
        list.add(4.5);

        System.out.println(list);

        // Классический способ
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        // Через итератор RemoveIf
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();

            if (obj instanceof Integer) {
                iterator.remove();
            }

        }
        // Аналогично предыдущему
        list.removeIf(obj -> obj instanceof Integer);

        System.out.println(list);
    }
}
