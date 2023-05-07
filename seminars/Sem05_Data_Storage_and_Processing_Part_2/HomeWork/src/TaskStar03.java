import Classes.Heap;

import java.util.Arrays;
import java.util.Random;

public class TaskStar03 {
    /*
    Реализовать алгоритм пирамидальной сортировки (HeapSort)
     */
    public static void main(String[] args) {
        Heap heap = new Heap();
        Integer[] source = getRandIntArray(20, 0, 42);
        System.out.printf("Исходный массив: %s\n", Arrays.toString(source));
        heap.heapSort(source, false);
        System.out.printf("Сортировка по возрастанию: %s\n", Arrays.toString(source));
        heap.heapSort(source, true);
        System.out.printf("Сортировка по убыванию: %s\n", Arrays.toString(source));
    }

    static Integer[] getRandIntArray(int length, int minValue, int maxValue) {
        Integer[] randIntArray = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randIntArray[i] = random.nextInt(minValue, maxValue + 1);
        }
        return randIntArray;
    }
}
