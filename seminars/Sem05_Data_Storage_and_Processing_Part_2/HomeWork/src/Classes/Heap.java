package Classes;


import java.util.Arrays;

public class Heap {
    private Integer[] heap = new Integer[10];
    private int n = 0;

    public boolean isEmpty() {
        return n == 0;
    }

    public void insert(Integer element) {
        if (n == heap.length) {
            heap = Arrays.copyOf(heap, heap.length * 2);
        }
        heap[n] = element;
        sift_up(n++);
    }

    public Integer getMin() {
        return heap[0];
    }

    public Integer removeMin() {
        Integer temp = heap[0];
        swap(0, --n);
        sift_down(0);
        return temp;
    }

    private void sift_up(int nodeIndex) {
        while (0 < nodeIndex && heap[nodeIndex] < heap[(nodeIndex - 1) / 2]) {
            swap(nodeIndex, (nodeIndex - 1) / 2);
            nodeIndex = (nodeIndex - 1) / 2;
        }
    }

    private void sift_down(int nodeIndex) {
        while (2 * nodeIndex + 1 < n) {
            int toSwap = 2 * nodeIndex + 1;
            if (2 * nodeIndex + 2 < n && heap[2 * nodeIndex + 2] < heap[toSwap]) {
                toSwap = 2 * nodeIndex + 2;
            }
            if (heap[nodeIndex] <= heap[toSwap]) {
                break;
            } else {
                swap(nodeIndex, toSwap);
                nodeIndex = toSwap;
            }
        }
    }

    private void swap(int fromIndex, int toIndex) {
        Integer temp = heap[toIndex];
        heap[toIndex] = heap[fromIndex];
        heap[fromIndex] = temp;
    }

    public void heapSort(Integer[] source, boolean reverseOrder) {
        heap = source;
        n = source.length;
        for (int i = source.length - 1; 0 <= i; i--) {
            sift_down(i);
        }
        for (int i = 0; i < source.length; i++) {
            removeMin();
        }
        if (reverseOrder) {
            return;
        }
        for (int i = 0; i < source.length / 2; i++) {
            swap(i, source.length - 1 - i);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(heap, n));
    }
}
