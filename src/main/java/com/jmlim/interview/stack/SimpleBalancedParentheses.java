package com.jmlim.interview.stack;

import java.util.EmptyStackException;

public class SimpleBalancedParentheses {

	public static boolean balancedParenthesesCheck(String parentheses) throws MaxSizeOverException {

		if (parentheses == null) {
			throw new IllegalArgumentException();
		}
		// imsi
		Stack<String> stack = new Stack<>(parentheses.length());
		int length = parentheses.length();
		for (int i = 0; i < length; i++) {
			char chr = parentheses.charAt(i);
			if (chr == '(') {
				stack.push(chr + "");
			} else if (chr == ')') {
				try {
					stack.pop();
				} catch (EmptyStackException e) {
					return false;
				}
			}
		}

		return stack.empty();
	}
}
