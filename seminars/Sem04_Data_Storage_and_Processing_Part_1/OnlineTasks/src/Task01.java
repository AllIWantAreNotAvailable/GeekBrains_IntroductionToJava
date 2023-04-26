import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task01 {
    /*
    1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
    2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list2.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.print(timeFinish - timeStart);
    }
}