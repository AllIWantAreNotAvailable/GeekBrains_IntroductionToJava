import java.util.Scanner;

public class TaskStar01 {
    /* Задача со звездочкой №1:
    Задано уравнение вида q + w = e; при этом q, w, e >= 0.
    Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
    Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
    решение или сообщить, что его нет.
     */

    public static void main(String[] args) {
        // Получаем шаблон выражения пользователя и создаем строку формата:
        String usersExpression = getExpression();

        // Делим выражение на операнды с операцией и результат:
        String[] slittedEquation = usersExpression.split(" = ");
        String stringOperandsAndOperation = slittedEquation[0].trim();
        String resultOfUsersExpression = slittedEquation[1].trim();

        // Разбиваем операнды с операцией на массив подстрок и преобразуем операнды к целому числу:
        String[] arrayOperands = stringOperandsAndOperation.split(" ");
        String leftOperand = arrayOperands[0].trim();
        String rightOperand = arrayOperands[2].trim();

        // Восстанавливаем выражение:
        String reconstructedExpression = getReconstructedExpression(leftOperand, rightOperand, resultOfUsersExpression);
        System.out.println(reconstructedExpression);
    }


    static String getExpression() {
        System.out.printf("Введите уравнение следующего типа: 2? + ?5 = 69; ?4 + ?5 = 69.\n>>> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    // 5? + 1?3 = 246
    // 246
    //  5?
    // 1?3
    //  93
    static String getReconstructedExpression(String leftOperand, String rightOperand, String expressionResult){

        // Индексы пропущенных цифр:
        int leftMissingIndex = leftOperand.indexOf('?');
        int rightMissingIndex = rightOperand.indexOf('?');

        // Временные переменные для промежуточных результатов:
        int tempInteger = Integer.parseInt(expressionResult);
        int tempLeft = Integer.parseInt(leftOperand.replace(leftOperand.charAt(leftMissingIndex), '0'));
        int tempRight = Integer.parseInt(rightOperand.replace(rightOperand.charAt(rightMissingIndex), '0'));
        tempInteger -= (tempLeft + tempRight);

        // Восстанавливаем операнды выражения:
        String difference = Integer.toString(tempInteger);
        String resultLeft = null;
        String resultRight = null;
        if (leftMissingIndex != rightMissingIndex) {
            int powOfTen = leftOperand.length() - leftMissingIndex - 1;
            int digit = (int) Math.pow(10.0, (double) powOfTen);
            resultLeft = Integer.toString(tempLeft + tempInteger / digit % 10 * digit);
            powOfTen = rightOperand.length() - rightMissingIndex - 1;
            digit = (int) Math.pow(10.0, (double) powOfTen);
            resultRight = Integer.toString(tempRight + tempInteger / digit % 10 * digit);
        } else {
            int missingDigit = Integer.parseInt(difference) >> 1;
            resultLeft = Integer.toString(tempLeft + missingDigit);
            resultRight = Integer.toString(tempRight + missingDigit);
        }

        return String.format("%s + %s = %s", resultLeft, resultRight, expressionResult);
    }
}
