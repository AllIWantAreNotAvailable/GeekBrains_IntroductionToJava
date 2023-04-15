public class Example02 {
    public static void main(String[] args) {
        // Числовые типы:
        short age = 26;
        System.out.println(age);

        int salary = 123456;
        System.out.println(salary);

        float e = 2.7f; // суффикс f для значений типа float является обязательным.
        System.out.println(e);

        double pi = 3.1415D; // суффикс D для значений типа double НЕ (!) является обязательным.
        System.out.println(pi);

        // Символьный тип (является неявно числовым типом):
        char first_chat = '1';
        System.out.println(first_chat);
        System.out.println(Character.isDigit(first_chat));

        first_chat = 'E';
        System.out.println(Character.isDigit(first_chat));

        // Логический тип данных:
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);

        boolean flag2 = 123 >= 234;
        System.out.println(flag2);

        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);

        boolean flag4 = true && false;
        System.out.println(flag4);
    }
}