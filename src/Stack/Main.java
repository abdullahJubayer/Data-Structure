package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "[{(1+2)}][]";


        System.out.println(reverseString(str));
        System.out.println(new Experssion().isBalanceExpression(str2));


        MyStack myStack=new MyStack();
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        System.out.println(myStack.toString());
        System.out.println(myStack.peek());
        System.out.println(myStack.toString());
        System.out.println(myStack.pop());
        System.out.println(myStack.toString());
        myStack.push(9);
        System.out.println(myStack.toString());

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
