package com.jmlim.dovelet.stair3.lunacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> eirthWeights = new ArrayList<Double>();
		double input = sc.nextDouble();
		while (input > -1) {
			eirthWeights.add(input);
			input = sc.nextDouble();
		}
		for (double eirthWeight : eirthWeights) {
			System.out.printf("Objects weighing %1.2f on Earth will weigh %1.2f on the moon.\n", eirthWeight,
					eirthWeight * 0.167);
		}
	}
}
