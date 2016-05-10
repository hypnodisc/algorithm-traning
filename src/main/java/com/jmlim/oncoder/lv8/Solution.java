package com.jmlim.oncoder.lv8;

public class Solution {
	public int solution(int n) {
		int cnt = 0, returnNum = 0;
		while (cnt != n) {
			returnNum++;
			String target = String.valueOf(returnNum);

			target = target.replaceAll("0|1|8|27|64", " ");
			target = target.trim();
			if (target.isEmpty()) {
				// System.out.println(returnNum + " " + target);
				cnt++;
				// break;
			}
		}
		System.out.println(returnNum);
		return returnNum;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution(10000);
	}
}
