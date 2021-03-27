package Algos.ArraysAndStrings.Strings;

import Utilities.Services.Inputs;

import java.util.Stack;

/**
 * Created by ANJALI on 6/8/2017.
 */
public class ValidParantheses {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    boolean isValidParantheses(String str) {
        Stack<Character> paranth = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                paranth.push(')');
            else if (c == '[')
                paranth.push(']');
            else if (c == '{')
                paranth.push('}');
            else if (paranth.isEmpty() || paranth.pop() != c)
                return false;
        }
        return paranth.isEmpty();
    }

    public static void main(String[] args) {
        ValidParantheses vp = new ValidParantheses();
        System.out.println(vp.isValidParantheses(new Inputs().getAString()));

    }
}
