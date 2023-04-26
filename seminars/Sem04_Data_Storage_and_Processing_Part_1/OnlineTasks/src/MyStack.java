import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack {
    /*
    Реализовать стэк с помощью массива.
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
     */

    private Integer[] array = new Integer[10];
    private int size = 0;


    int size() {
        return size;
    }


    boolean empty() {
        return size == 0;
    }


    void push(int item) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = item;
    }


    int peak() {
            return array[size - 1];
    }


    int pop() {
        return array[--size];
    }
}
