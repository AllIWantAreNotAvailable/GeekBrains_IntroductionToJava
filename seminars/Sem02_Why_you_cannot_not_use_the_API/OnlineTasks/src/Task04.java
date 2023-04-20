import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task04 {
    /*
    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    который запишет эту строку в простой текстовый файл, обработайте исключения.
     */

    public static void main(String[] args) {
        String repeats = getUserString("Введите строку")
                                .repeat(getUserValue("Сколько раз повторить?"));
        System.out.println(repeats);
        saveToFile(repeats);
        saveToFile(repeats, "test.txt");
    }


    static String getUserString(String invitation) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s:\n>>> ", invitation);
        return scanner.nextLine();
    }


    static int getUserValue(String invitation) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s:\n>>> ", invitation);
        return scanner.nextInt();
    }


    static void saveToFile(String source, String path) {

        Logger logger = Logger.getAnonymousLogger();
        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("logger.log");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        logger.addHandler(logHandler);

        try (FileWriter newDump = new FileWriter(path, true)) {
            newDump.append(source);
            newDump.append("\n");
            newDump.flush();
        } catch (IOException exception) {  // Исключение класса FileWriter
            exception.printStackTrace();
            logger.log(Level.WARNING, exception.toString());
        } catch (Exception exception) {  // Общее исключение
            exception.printStackTrace();
            logger.log(Level.WARNING, exception.getMessage());
        }
        logHandler.close();
    }


    static void saveToFile(String source) {
        String path = "/n/n/dump.txt";

        
        Logger logger = Logger.getAnonymousLogger();
        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("logger.log");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        logger.addHandler(logHandler);


        try (FileWriter newDump = new FileWriter(path, true)) {
            newDump.append(source);
            newDump.append("\n");
            newDump.flush();
        } catch (IOException exception) {  // Исключение класса FileWriter
            exception.printStackTrace();
            logger.log(Level.WARNING, exception.toString());
        } catch (Exception exception) {  // Общее исключение
            exception.printStackTrace();
            logger.log(Level.WARNING, exception.getMessage());
        }
        logHandler.close();
    }
}
