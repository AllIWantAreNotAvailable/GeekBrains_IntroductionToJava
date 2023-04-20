import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task03 {
    /*
    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл:
    1) создать массив случайно длины (ограничим генерацию в диапазоне [10...100] элементов);
    2) заполнить массив случайными натуральными числами (ограничим генерацию [0...100]);
    3) реализовать механизм сортировки методом пузырька;
    4) оптимизировать алгоритм, частично сократить кол-во итераций для сортировки;
    5) логировать результат каждой итерации в файл *.log
     */
    public static void main(String[] args) {
        int[] myArray = getRandIntArray(new Random().nextInt(10, 100 + 1), 0, 100);
        sorted(myArray);
    }


    static int[] getRandIntArray(int length, int minValue, int maxValue) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(minValue, maxValue + 1);
        }

        return array;
    }


    static void sorted(int[] sourceArray) {

        // Инициализируем экземпляр класса Logger:
        Logger logger = Logger.getAnonymousLogger();

        // Пытаемся инициализировать и связать обработчик записи в файл к экземпляру Logger:
        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("Task03_logs.log");
            logger.addHandler(logHandler);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // Реализация алгоритма сортировки методом пузырька:
        int length = sourceArray.length;
        for (int bound = 0; bound < length - 1; bound++) {
            for (int current = 0; current < length - bound - 1; current++) {
                int currentValue = sourceArray[current];
                if (sourceArray[current + 1] < currentValue) {
                    sourceArray[current] = sourceArray[current + 1];
                    sourceArray[current + 1] = currentValue;
                }
                String loggerString = String.format("%d.%d. %s\n", bound + 1, current + 1, Arrays.toString(sourceArray));
                logger.log(Level.INFO, loggerString);
            }
        }

        logHandler.close();
    }



}
