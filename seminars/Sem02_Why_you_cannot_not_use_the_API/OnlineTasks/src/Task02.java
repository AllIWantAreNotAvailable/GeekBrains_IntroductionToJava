import java.util.Scanner;

public class Task02 {
    /*
    Напишите метод, который сжимает строку.
    Пример: вход aaaabbbcdd.
    Результат: a4b3cd2
     */

    public static void main(String[] args) {
        String userString = getUserSequence("Введите символьную последовательнсоть");
        System.out.println(zipUsersString(userString));
    }


    static String getUserSequence(String invitation) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s:\n>>> ", invitation);
        return scanner.nextLine();
    }


    static String zipUsersString(String source) {
        int counter = 1;
        StringBuilder zipedSequence = new StringBuilder();
        char[] sequence = source.toCharArray();
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] == sequence[i - 1]) {
                counter++;
            }
            else {
                zipedSequence.append(sequence[i-1]);
                if (1 < counter) {
                    zipedSequence.append(counter);
                    counter = 1;
                }
            }
        }
        zipedSequence.append(sequence[sequence.length-1]);
        if (1 < counter) {
            zipedSequence.append(counter);
        }

        return zipedSequence.toString();
    }
}
