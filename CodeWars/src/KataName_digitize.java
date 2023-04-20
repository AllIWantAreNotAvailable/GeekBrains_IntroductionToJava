import java.util.Arrays;

public class KataName_digitize {
    /*
    Convert number to reversed array of digits
    Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

    Example(Input => Output):
    35231 => {1,3,2,5,3}
    0 => {0}
    23582357 => {7,5,3,2,8,5,3,2}
    984764738 => {8,3,7,4,6,7,4,8,9}
    45762893920L => {0,2,9,3,9,8,2,6,7,5,4}
    548702838394L => {4,9,3,8,3,8,2,0,7,8,4,5}
     */

    public static void main(String[] args) {
        long[] tests = new long[]{35231, 0, 23582357, 984764738, 45762893920L, 548702838394L};
        int num = 1;
        System.out.println("From my solution:");
        for (long test: tests) {
            System.out.printf("%d. %d => %s\n", num++, test, Arrays.toString(digitize(test)));
        }
        System.out.println("\n");
        num = 1;
        System.out.println("From top Clever:");
        for (long test: tests) {
            System.out.printf("%d. %d => %s\n", num, test, Arrays.toString(digitizeClever(test)));
        }
    }


    static int[] digitize(long n) {
        int[] array = new int[0];
        int i = 0;
        while (0 < n) {
            array = Arrays.copyOf(array, array.length + 1);
            array[i] = (int) (n % 10);
            n /= 10;
            i++;
        }
        return array;
    }


    static int[] digitizeClever(long n) {
        return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
    }
}