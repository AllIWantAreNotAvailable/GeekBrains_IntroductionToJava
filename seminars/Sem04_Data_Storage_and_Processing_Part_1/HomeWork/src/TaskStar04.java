import Classes.StarQueue;

public class TaskStar04 {
    /*
    Реализуйте очередь с помощью массива со следующими методами:
        - enqueue() - помещает элемент в конец очереди;
        - dequeue() - возвращает первый элемент из очереди и удаляет его;
        - first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        StarQueue starQueue = new StarQueue();
        starQueue.enqueue(1);
        starQueue.enqueue(2);
        starQueue.enqueue(3);
        starQueue.enqueue(4);
        starQueue.enqueue(5);
        System.out.println(starQueue);
        System.out.println(starQueue.first());
        starQueue.dequeue();
        starQueue.dequeue();
        starQueue.dequeue();
        System.out.println(starQueue);
        starQueue.dequeue();
        starQueue.dequeue();
        System.out.println(starQueue);
    }
}
