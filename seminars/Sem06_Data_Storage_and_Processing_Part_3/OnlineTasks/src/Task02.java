import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Task02 {
    /*
    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
    уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
    Для вычисления процента используйте формулу:
    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        Integer[] sourceArray = createArray(20, 0, 24);
        System.out.println(Arrays.toString(sourceArray));
        double uniquePercent = uniquePercent(sourceArray);
        System.out.printf("Процент уникальности %f", uniquePercent);
    }

    static Integer[] createArray(int length, int minValue, int maxValue) {
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * (maxValue - minValue + 1) + minValue);
        }
        return array;
    }

    static double uniquePercent(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        return set.size() * 100.0 / array.length;
    }
}
