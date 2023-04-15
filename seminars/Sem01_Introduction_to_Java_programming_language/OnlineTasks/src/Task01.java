/*
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

import java.time.LocalTime;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (5 <= hour && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (hour < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Доброй ночи, %s!", name);
        }
        scanner.close(); // Если закрыт в середине программы, то в дальнейшем не удастся получить доступ к System.in
    }
}