package com.jmlim.dovelet.stair3.selfdup;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			int x = (int) Math.pow(i, 2);

			String str = i + "";
			int ten = (int) Math.pow(10, str.length());
			if(i == (x % ten)) {
				//System.out.println(i + " " + x + " " + str.length() + " " + ten + " " + (x % ten));				
				System.out.println(i);
			}
		}
	}
}
