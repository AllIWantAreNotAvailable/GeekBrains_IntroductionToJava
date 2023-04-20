import java.util.Scanner;

public class Task01 {
    /*
    Дано четное число N (>0) и символы c1 и c2.
    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    Ответ: c1c2c1…c2 (всего N символов)
     */

    public static void main(String[] args) {
        int userValue = getUserValue("Введите верхнюю границу вывода символов");
        char firstChar = 'a'; char secondChar = 'b';
        System.out.println(makeStringOfChars(userValue, firstChar, secondChar));
    }


    static int getUserValue(String invitation) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s:\n>>> ", invitation);
        return scanner.nextInt();
    }

    static String makeStringOfChars(int upperBound, char c1, char c2) {
        if (upperBound % 2 != 0) {
            return "Введено нечетное число, условие задачи не выполнено.";
        }

        StringBuilder charSequence = new StringBuilder();
        for (int i = 0; i < upperBound / 2; i++) {
            charSequence.append(c1).append(c2);
        }

        return charSequence.toString();
    }
}
