import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {
    /*
    Реализовать консольное приложение, которое:
    Принимает от пользователя строку вида
    text~num
    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;
        while (repeat) {
            System.out.printf("%s\n>>> ", "Введите строку вида text~num:");
            String line = scanner.nextLine();
            String[] array = line.split("~");
            int num = Integer.parseInt(array[1]);
            String text = array[0];

            switch (text) {
                case "print" -> System.out.println(linkedList.remove(num));
                case "exit" -> repeat = false;
                default -> linkedList.add(num, text);
            }
        }
    }

}
