import java.util.*;

public class Task02 {
    /*
    Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его на экран.
     */
    public static void main(String[] args) {
        List<Integer> myArray = getRandIntArray(new Random().nextInt(5, 10 + 1), 0, 10);
        System.out.println(myArray);
        sorting(myArray);
        System.out.println(myArray);
    }


    static List<Integer> getRandIntArray(int length, int minValue, int maxValue) {
        List<Integer> array = new ArrayList<>(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array.add(random.nextInt(minValue, maxValue + 1));
        }

        return array;
    }

    static void sorting(List<Integer> list){
        Collections.sort(list);
    }
}
