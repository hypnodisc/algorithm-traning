package com.jmlim.interview.stack;

public class TestMain {
	public static void main(String[] args) throws MaxSizeOverException {

		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("((((((())"));
		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("()))"));
		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("(()()(()"));
		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("(()))("));
		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("())(())"));

		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("(()()()())"));
		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("(((())))"));
		System.out.println(SimpleBalancedParentheses.balancedParenthesesCheck("(()((())()))"));

	}
}
