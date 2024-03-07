package com.dhenusya;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int factorial = getFactorial(number);
		System.out.println(factorial);
		
	}
	public static int getFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num*getFactorial(num-1);
	}
}
