import java.util.Collections;
import java.util.List;

public class Task02 {
    /* Задача №02:
    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
     */

    public static void main(String[] args) {
        List<Integer> randomList = Task01.getRandIntList(10, 0, 10);
        int minValue = Collections.min(randomList);
        int maxValue = Collections.max(randomList);
        Double avgOfList = randomList.stream().mapToInt(Integer::intValue).average().getAsDouble();

        showOnScreen(randomList, minValue, maxValue, avgOfList);
    }


    private static void showOnScreen(List<Integer> randomList, int minValue, int maxValue, Double avgOfList) {
        StringBuilder resultOut = new StringBuilder();
        resultOut.append(String.format("Список: %s;\n", randomList));
        resultOut.append(String.format("Мин. знач. -> %d;\n", minValue));
        resultOut.append(String.format("Макс. знач. -> %d;\n", maxValue));
        resultOut.append(String.format("Ср. знач.: %.2f", avgOfList));
        System.out.println(resultOut);
    }
}
