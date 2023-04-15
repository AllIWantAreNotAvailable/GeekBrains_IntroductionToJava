/* Задача №2:
Вычислить n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int inputtedNumber = getUserNumber();
        int factorial = getFactorial(inputtedNumber);
        System.out.printf("%d! = %d", inputtedNumber, factorial);
    }


    static int getUserNumber() {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    static int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * getFactorial(--number);
    }
}
