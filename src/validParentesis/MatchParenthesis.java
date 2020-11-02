/**Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.

 Example 1:
 Input: "()"
 Output: true

 Example 2:
 Input: "()[]{}"
 Output: true

 Example 3:
 Input: "(]"
 Output: false

 Example 4:
 Input: "([)]"
 Output: false

 Example 5:
 Input: "{[]}"
 Output: true

 Solution:

 Algorithm/Approach

 => stack
 1. best -
 check for null - true;
 check the 1st ),},] - false
 2. push -> (,{,[
 3. ),],} - charAt(index)
 pop()- ch
 check- charAt(index) if not equal -> return false
 4 - >return stack.empty();

 *
 */


package validParentesis;

import java.util.Stack;

public class MatchParenthesis {
    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(validateParenthesis(str));
    }

    private static boolean validateParenthesis(String str) {
        if(str.length() == 0) return true;
        if(str.charAt(0) == ')' || str.charAt(0) == ']' || str.charAt(0) == '}') return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()) return false;
                Character ch = stack.peek();
                if((ch == '[' && str.charAt(i)==']') ||
                        (ch == '{' && str.charAt(i)=='}') ||
                        (ch == '(' && str.charAt(i)==')') ){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }
}