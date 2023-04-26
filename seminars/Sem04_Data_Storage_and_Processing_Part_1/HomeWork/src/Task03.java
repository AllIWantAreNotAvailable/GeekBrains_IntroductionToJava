import java.util.LinkedList;
import java.util.ListIterator;

public class Task03 {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = Task01.getFilledLinkedList(2, 0, 10);
        int sumOfElements = getSum(list);
        System.out.printf("%s => %d", list, sumOfElements);
    }


    static int getSum(LinkedList<Integer> source) {
        ListIterator<Integer> listIterator = source.listIterator();
        int sum = 0;

        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }

        return sum;
    }
}
