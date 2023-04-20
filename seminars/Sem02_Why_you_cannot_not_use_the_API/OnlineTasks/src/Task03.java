import java.util.Scanner;

public class Task03 {
    /*
    Напишите метод, который принимает на вход строку (String) и определяет является ли строка
    палиндромом (возвращает boolean значение).
    Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
     */
    public static void main(String[] args) {
        String usersString = getUserString("Введите фразу для проверки");
        System.out.printf("%s", isPalindrome(usersString) ? "Вы ввели полиндром" : "Вы ввели НЕ полиндром");
    }


    static String getUserString(String invitation) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s:\n>>> ", invitation);
        return scanner.nextLine();
    }


    static boolean isPalindrome(String phrase) {
        phrase = phrase.replace(" ", "");
        StringBuilder source = new StringBuilder(phrase);
        return source.reverse()
                     .toString()
                     .equalsIgnoreCase(phrase);
    }
}
