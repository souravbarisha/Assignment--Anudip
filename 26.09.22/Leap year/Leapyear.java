package com.assignment;

import java.util.Scanner;

public class Leapyear {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
//		user input
		System.out.println("enter a number"); 
		int year= sc.nextInt();
		
//		condition
		if((year%4==0) && (year%100 != 0) && (year%400 ==0)) {
			System.out.println("this is leap year");
		}
		else {
			System.out.println("this is not a leap year");
		}
	}
}
