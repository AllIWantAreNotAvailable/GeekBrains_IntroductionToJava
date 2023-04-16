import java.util.Scanner;

public class Task01 {
    /* Задача №1:
    Вычислить n-ое треугольного число (сумма чисел от 1 до n)
     */

    public static void main(String[] args) {
        int ordNumber = getUserNumber();
         double dSequenceMember = getSequenceMember(ordNumber);
         showMemberOfSequence(ordNumber, dSequenceMember);
    }


    static int getUserNumber() {
        System.out.printf("Введите порядковый номер треугольного числа: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    static double getSequenceMember(int ordinalNumber) {
        return (double) ordinalNumber / 2 * ((double) ordinalNumber + 1);
    }


    static void showMemberOfSequence(int ordinalNumber, double member) {
        System.out.printf("%d-е треугольное число – это %.0f", ordinalNumber, member);
    }
}
