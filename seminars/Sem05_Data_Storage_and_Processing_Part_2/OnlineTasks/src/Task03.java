import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task03 {
    /*
    Написать программу, определяющую правильность расстановки скобок в выражении.
    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь
     */


    public static void main(String[] args) {
        System.out.println(isCorrectSequence("a+(d*3)"));
        System.out.println(isCorrectSequence("[a+(1*3)"));
        System.out.println(isCorrectSequence("[6+(3*3)]"));
        System.out.println(isCorrectSequence("{a}[+]{(d*3)}"));
        System.out.println(isCorrectSequence("<{a}+{(d*3)}>"));
        System.out.println(isCorrectSequence("{a+]}{(d*3)}"));
    }


    static boolean isCorrectSequence(String sequence) {
        char[] source = sequence.toCharArray();
        Map<Character, Character> bracers = new HashMap<>(){};
        bracers.put('(', ')');
        bracers.put('[', ']');
        bracers.put('{', '}');
        bracers.put('<', '>');

        Stack<Character> stack = new Stack<>();
        for (char c : source) {
            if (bracers.containsKey(c)) {
                stack.push(c);
            } else {
                if (bracers.containsValue(c)) {
                    if (stack.isEmpty() || bracers.get(stack.pop()) != c) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
