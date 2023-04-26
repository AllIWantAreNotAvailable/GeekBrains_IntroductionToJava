import Classes.OwnQueue;

public class Task02 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
        - enqueue() - помещает элемент в конец очереди;
        - dequeue() - возвращает первый элемент из очереди и удаляет его;
        - first() - возвращает первый элемент из очереди, не удаляя.
     */

    public static void main(String[] args) {
        OwnQueue myOwnQueue = new OwnQueue();
        myOwnQueue.enqueue(1);
        myOwnQueue.enqueue(2);
        myOwnQueue.enqueue(3);
        myOwnQueue.enqueue(4);
        myOwnQueue.enqueue(5);
        System.out.println(myOwnQueue);
        System.out.println(myOwnQueue.first());
        System.out.println(myOwnQueue);
        System.out.println(myOwnQueue.dequeue());
        System.out.println(myOwnQueue.dequeue());
        System.out.println(myOwnQueue);
    }
}
