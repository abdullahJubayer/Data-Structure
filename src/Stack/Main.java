package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "[{(1+2)}][]";


        System.out.println(reverseString(str));
        System.out.println(new Experssion().isBalanceExpression(str2));
    }

    public static StringBuffer reverseString(String str) {
        StringBuffer reverse = new StringBuffer("");
        Stack<String> stack = new Stack<>();

        char[] ch = str.toCharArray();
        for (char c : ch) {
            stack.push(String.valueOf(c));
        }
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        return reverse;
    }
}
