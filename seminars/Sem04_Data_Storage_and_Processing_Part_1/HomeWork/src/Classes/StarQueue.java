package Classes;

import java.util.Arrays;

public class StarQueue {
    /*
    - enqueue() - помещает элемент в конец очереди;
    - dequeue() - возвращает первый элемент из очереди и удаляет его;
    - first() - возвращает первый элемент из очереди, не удаляя.
     */

    private Integer[] backstage = new Integer[10];
    private int first = 0;
    private int last = 0;


    public void enqueue(int newElem) {
        if (last == backstage.length) {
            backstage = Arrays.copyOf(backstage, backstage.length * 2);
        }
        backstage[last++] = newElem;
    }


    public int size() {
        return last - first + 1;
    }


    public int dequeue() {
        int temp = backstage[first++];
        int curSize = size();

        if (2 < backstage.length / curSize) {
            Integer[] changeling = new Integer[curSize * 2];
            System.arraycopy(backstage, first, changeling, 0, last + 1);
            backstage = changeling;
            int spam = last - first;
            last = Math.max(0, spam);
            first = 0;
        }

        return temp;
    }


    public int first() {
        return backstage[first];
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (int i = first; i < last - 1; i++) {
            stringBuilder.append(backstage[i]);
            stringBuilder.append(", ");
        }
        if (0 < last - 1) {
            stringBuilder.append(backstage[last - 1]);
        }
        stringBuilder.append(']');

        return stringBuilder.toString();
    }

}
