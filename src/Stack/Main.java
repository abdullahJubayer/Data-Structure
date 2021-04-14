package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = "{}[(({1+2}))]";

        System.out.println(reverseString(str));
        System.out.println(isStringBalanced(str2));
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

    public static boolean isStringBalanced(String str) {
        int flag = 0;
        Stack<Character> characters = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c.equals('(') || c.equals('{') || c.equals('[') || c.equals('<')) {
                characters.push(c);
            } else {
                if (c.equals(')') || c.equals('}') || c.equals(']') || c.equals('>')) {
                    if (characters.isEmpty())
                        return false;
                    var openingTag = characters.pop();
                    Character closingTag = '0';
                    switch (openingTag) {
                        case '(':
                            closingTag = ')';
                            break;
                        case '{':
                            closingTag = '}';
                            break;
                        case '[':
                            closingTag = ']';
                            break;
                        case '<':
                            closingTag = '>';
                            break;
                    }
                    if (closingTag.equals(c)) {
                        flag = 1;
                    } else {
                        flag = 0;
                    }
                }
            }
        }
        return flag == 1 && characters.isEmpty();
    }
}
