import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task01 {
    /*
    1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    - Распечатайте содержимое данного множества.
    2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    - Распечатайте содержимое данного множества.
    3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    - Распечатайте содержимое данного множества.
     */
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 2, 6, 1, 2, 4, 5, 3};

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(array));

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

    }
}