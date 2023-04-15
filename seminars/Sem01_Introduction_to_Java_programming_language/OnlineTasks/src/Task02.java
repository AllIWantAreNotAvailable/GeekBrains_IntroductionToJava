import java.util.Arrays;
import java.util.Random;

/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */
public class Task02 {
    public static void main(String[] args) {

        int[] out_array = getArray(6, 0, 1);
        int maxOnesSequence = counter(out_array);
        System.out.println(Arrays.toString(out_array));
        System.out.println(maxOnesSequence);
    }

    static int[] getArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random randInt = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = randInt.nextInt(minValue, maxValue + 1);
        }
        return array;
    }

    static int counter(int[] someArray) {
        int sequenceLength = -1;
        int temp = 0;
        for (int j : someArray) {
            if (j == 1) {
                temp++;
            } else {
                if (sequenceLength < temp) {
                    sequenceLength = temp;
                }
                temp = 0;
            }
        }
        if (sequenceLength < temp) {
            sequenceLength = temp;
        }
        return sequenceLength;
    }


}
