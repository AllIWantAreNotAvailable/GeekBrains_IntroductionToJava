public class Example04 {
    public static void main(String[] args) {
        // ЯВНОЕ ПРЕОБРАЗОВАНИЕ ТИПОВ

        // Карта неявного преобразования
        //                  Character
        //                      V
        // Byte => Short => Integer => Long => Float, Double
        //                      V
        //                 Float, Double

        // ЯВНОЕ ПРЕОБРАЗОВАНИЕ НА ПРАКТИКЕ

        // Возьмем переменную с типом int и double:
        // int можем неявно преобразовать в double
        int i = 123; double d = i;
        System.out.printf("%d, %.4f", i, d);
        // double нельзя преобразовать неявно в int,
        // чтобы это провернуть используем приведение типа к int:
        d = 3.1415; i = (int) d;
        System.out.printf("%.4f, %d", d, i);
    }
}
