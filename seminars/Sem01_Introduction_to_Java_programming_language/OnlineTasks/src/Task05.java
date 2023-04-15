/*
Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */

public class Task05 {
    public static void main(String[] args) {
        System.out.println(getPow(2, -2));
    }
    
    static double getPow(int base, int pow) {
        if (pow == 0 || base == 1) {
            return 1;
        } else if (base == 0) {
            return 0;
        }
        double result = 1;
        for (int i = 0; i < Math.abs(pow); i++) {
            result *= base;
        }
        return 0 < pow ? result : 1 / result;
    }
}
