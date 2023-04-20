import java.io.*;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks_01_and_02 {
    /*      [
              {
                  "фамилия":"Иванов",
                  "оценка":"5",
                  "предмет":"Математика"
              },
              {
                  "фамилия":"Петрова",
                  "оценка":"4",
                  "предмет":"Информатика"
              },
              {
                  "фамилия":"Краснов",
                  "оценка":"5",
                  "предмет":"Физика"
              }
            ]

    1. Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
        - Студент Иванов получил 5 по предмету Математика.
        - Студент Петрова получил 4 по предмету Информатика.
        - Студент Краснов получил 5 по предмету Физика.
    2. Используйте StringBuilder для подготовки ответа:
        - Исходная json строка это просто String.
        - Для работы используйте методы String (replace, split, substring и т.д.) по необходимости.
    3. Создать метод, который запишет результат работы в файл:
        - Обработайте исключения и запишите ошибки в лог файл.
    4. *Получить исходную json строку из файла, используя FileReader или Scanner
     */

    public static void main(String[] args) {
        String jsonObject = getJsonString();
        String result = parseJSON(jsonObject);
        System.out.println(result);
        saveToFile(result);
    }


    static String getJsonString() {
        // Указываем путь к файлу:
        String path = "gradebook.json";

        // Инициализируем экземпляр класса Logger:
        Logger logger = Logger.getAnonymousLogger();

        // Пытаемся инициализировать и связать обработчик записи в файл к экземпляру Logger:
        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("Tasks_01_and_02_logs.log");
            logger.addHandler(logHandler);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // Создаем экземпляр StringBuilder для накопления считываемой информации из файлаЖ
        StringBuilder stringBuilder = new StringBuilder();
        // Пытаемся считать данные из файла
        try (FileReader fileReader = new FileReader(path);
             Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
            logger.log(Level.INFO, "Файл успешно считан, начинаем возврат значения,");
        } catch (FileNotFoundException exception) {
            logger.log(Level.WARNING, String.format("Исключение выброшенное из FileReader: %s", exception));
        } catch (IOException exception) {
            logger.log(Level.WARNING, String.format("Исключение выброшенное из Scanner: %s", exception));
        }

        logHandler.close();

        return stringBuilder.toString();
    }

    static String parseJSON(String json) {
        // От макета строки нам не уйти априори:
        String[] template = new String[]{"- Студент ", " получил ", " по предмету ", ".\n"};
        int templateIndex = 0;
        // Строку формируем классом StringBuilder:
        StringBuilder resultString = new StringBuilder();
        // С помощью регулярных выражений отрезаем только значения словарей из JSON
        Pattern valuePattern = Pattern.compile(":\".+?[,}]");
        Matcher valueMatcher = valuePattern.matcher(json);
        while (valueMatcher.find()) {
            // В начале каждой итерации добавляем часть Нашего шаблона:
            resultString.append(template[templateIndex++]);
            resultString.append(json.subSequence(valueMatcher.start() + 2, valueMatcher.end() - 2));
            // В конце каждой итерации проверяем, не дошли ли мы до последнего индекса шаблона:
            if (templateIndex == template.length - 1) {
                // Если это конец шаблона, то добавляем точку и перенос каретки, после чего обнуляем индекс:
                resultString.append(template[templateIndex]);
                templateIndex = 0;
            }
        }
        return resultString.toString();
    }


    static void saveToFile(String source) {
        // Указываем путь к файлу:
        String path = "output.txt";

        // Инициализируем экземпляр класса Logger:
        Logger logger = Logger.getAnonymousLogger();

        // Пытаемся инициализировать и связать обработчик записи в файл к экземпляру Logger:
        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("Tasks_01_and_02_logs.log");
            logger.addHandler(logHandler);
        } catch (IOException exception) {
            exception.printStackTrace();
        }


        // Пытаемся записать результат работы в файл:
        try (FileWriter newDump = new FileWriter(path, true)) {
            newDump.append(source);
            newDump.append("\n");
            newDump.flush();
            logger.log(Level.INFO, "Файл вывода успешно дописан новыми данными.");
        } catch (IOException exception) {
            logger.log(Level.WARNING, exception.toString());
        }

        logHandler.close();
    }
}
