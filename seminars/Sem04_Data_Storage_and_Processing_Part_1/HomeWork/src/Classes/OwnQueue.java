package Classes;

import java.util.LinkedList;

public class OwnQueue {
    /*
    - enqueue() - помещает элемент в конец очереди;
    - dequeue() - возвращает первый элемент из очереди и удаляет его;
    - first() - возвращает первый элемент из очереди, не удаляя.
     */
    private LinkedList<Integer> backStage = new LinkedList<>();

    public void enqueue(int newElem) {
        backStage.add(newElem);
    }


    public int dequeue() {
        return backStage.removeFirst();
    }


    public int first() {
        return backStage.getFirst();
    }


    @Override
    public String toString() {
        return backStage.toString();
    }
}
