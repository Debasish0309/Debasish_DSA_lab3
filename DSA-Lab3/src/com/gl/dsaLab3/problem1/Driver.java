package com.gl.dsaLab3.problem1;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("Enter the Brackets or q to Quit :");
			String str = sc.next();
			if (str.equalsIgnoreCase("q")) {
				flag = false;
				continue;
			}
			boolean balanced = BalancedBrackets.isBalanced(str);
			if (balanced) {
				System.out.println("The entered String has Balanced Brackets");
			} else {
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
		}
		sc.close();
	}

}
