public class Task01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = s1;
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        String s4 = "h" + "e" + "l" + "l" + "o";
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        String s5 = new String("hello");
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));
    }
}
