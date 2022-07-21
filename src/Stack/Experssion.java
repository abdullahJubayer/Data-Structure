package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Experssion {
    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public boolean isBalanceExpression(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character character : str.toCharArray()) {
            if (isLeftBrackets(character))
                stack.push(character);
            if (isRightBrackets(character)) {
                if (stack.isEmpty())
                    return false;
                var left = stack.pop();
                if (!isMatchBrackets(left, character))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBrackets(Character character) {
        return leftBrackets.contains(character);
    }

    private boolean isRightBrackets(Character character) {
        return rightBrackets.contains(character);
    }

    private boolean isMatchBrackets(Character left, Character right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
