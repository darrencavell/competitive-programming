package valid.parentheses;

import java.util.Stack;

public class ValidParentheses {

	/*
	 * Given a string consists of '(', '[', '{', ')', ']', '}'.
	 * Determine if the input string is valid.
	 * 	1. Open bracket must be closed by the same type.
	 * 	2. Open bracket must be closed in the correct order.
	 *
	 * Input: "()"
	 * Output: true
	 *
	 * Input: "([)]"
	 * Output: false
	 */

	public ValidParentheses() {
		String text = "(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){";
		System.out.println(isValid(text));
	}
	public int findParentheses(char[] parentheses, char parenthesis) {
		return new String(parentheses).indexOf(parenthesis);
	}
	public boolean defineParenthesesType(char[] parentheses, int i, String text) {
		return new String(parentheses).indexOf(text.charAt(i)) != -1;
	}
	public boolean isValid(String text) {
		char[] parenthesesOpen = {'(', '[', '{'};
		char[] parenthesesClose = {')', ']', '}'};
		Stack<Character> parenthesesPosition = new Stack<>();
		if(text.length() % 2 != 0)
			return false;
		for(int i = 0; i < text.length(); i++) {
			if(defineParenthesesType(parenthesesOpen, i, text)) {
				parenthesesPosition.push(text.charAt(i));
			} else if(defineParenthesesType(parenthesesClose, i, text) && !parenthesesPosition.isEmpty()) {
				Character stackPop = parenthesesPosition.peek();
				int idxStackPop = findParentheses(parenthesesOpen, stackPop);
				int idxComparison = findParentheses(parenthesesClose, text.charAt(i));
				if (idxStackPop == idxComparison) {
					parenthesesPosition.pop();
					continue;
				}
				break;
			}
		}
		if(parenthesesPosition.isEmpty())
			return true;
		return false;
	}
}
