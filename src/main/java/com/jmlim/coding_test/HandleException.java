package com.jmlim.coding_test;

public class HandleException {
	public static void main(String[] argv) {
		String number;
		//System.out.println(toInt(number));
		number = "9,900";
		System.out.println(toInt(number));
		number = "10";
		System.out.println(toInt(number));
	}

	public static int toInt(String strValue) {
		if (strValue == null || strValue.length() == 0) {
			throw new IllegalArgumentException();
		}
		int intValue = 0;
		try {
			intValue = Integer.parseInt(strValue);
		} catch (Exception e) {
			intValue = 0;
		}
		return intValue;
	}
}
