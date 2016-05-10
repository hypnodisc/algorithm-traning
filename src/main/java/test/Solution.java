package test;

public class Solution {
	public long solution(int N) {
		long prev = 0;
		long current = 1;
		for (long i = 1; i <= N; i++) {
			long sum = prev + current;
			prev = current;
			current = sum;
		}
		return prev;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(4));
	}
}
