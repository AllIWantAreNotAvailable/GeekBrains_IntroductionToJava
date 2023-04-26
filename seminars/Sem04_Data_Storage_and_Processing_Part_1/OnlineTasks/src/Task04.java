import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task04 {
    /*
    1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
    2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
     */
    public static void main(String[] args) {

        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
