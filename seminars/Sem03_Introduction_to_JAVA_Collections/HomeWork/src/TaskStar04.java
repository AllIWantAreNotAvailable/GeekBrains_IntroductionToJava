import java.util.Arrays;
import java.util.Random;

public class TaskStar04 {
    /*
    Реализовать алгоритм сортировки слиянием.
     */

    public static void main(String[] args) {
        int[] arrayToSort = getRandIntArray(10, 0, 10);
        System.out.println(Arrays.toString(arrayToSort));
        divideAndConquer(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }


    private static int[] getRandIntArray(int length, int minValue, int maxValue) {
        int[] newArray = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(minValue, maxValue + 1);
        }
        return newArray;
    }


    static void divideAndConquer(int[] source) {
        // <= START divide
        if (source.length == 1) {
            return;
        }
        int middle = source.length / 2;
        int[] left = Arrays.copyOfRange(source, 0, middle);
        int[] right = Arrays.copyOfRange(source, middle, source.length);

        divideAndConquer(left);
        divideAndConquer(right);
        // STOP divide =>

        // <= START conquer
        conquer(source, left, right);
        // STOP conquer =>
    }


    static void conquer(int[] array, int[] leftPart, int[] rightPart) {
        int rIndex = 0;
        int lIndex = 0;
        int mIndex = 0;

        while (lIndex < leftPart.length && rIndex < rightPart.length) {
            if (leftPart[lIndex] < rightPart[rIndex]) {
                array[mIndex++] = leftPart[lIndex++];
            } else {
                array[mIndex++] = rightPart[rIndex++];
            }
        }

        for (int i = lIndex; i < leftPart.length; i++) {
            array[mIndex++] = leftPart[i];
        }
        for (int i = rIndex; i < rightPart.length; i++) {
            array[mIndex++] = rightPart[i];
        }
    }

}
