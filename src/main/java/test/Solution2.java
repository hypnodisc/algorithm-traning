package test;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public String solution(int number) {
		List<Integer> primes = new ArrayList<>();
		primes.add(2);

		for (int i = 2; i <= number; i++) {
			int cnt = 0;
			for (int j = 0; j < primes.size(); j++) {
				if (i % primes.get(j) == 0) {
					cnt++;
					break;
				} 
				if(j+1 == primes.size()) {
					primes.add(i);
				}
			}
		}
		System.out.println(primes);
		return "True";
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.solution(51231));
	}
}
