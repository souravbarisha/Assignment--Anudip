package com.assignment;

import java.util.Scanner;

public class CheckPrimeNumber {
public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
//	user input
	 System.out.println(" Enter the number");
	int num = sc.nextInt();
//	condition 
	boolean flag = false;
	if(num==1) {
		flag=false;
	}
	for(int i=2; i<num/2; i++) {
		if(num%i==0) {
			flag = true;
			break;
		}
	}
	if(!flag) {
		System.out.println("this is a prime number");
	}
	else {
		System.out.println("this is not a prime number");
	}
}
}
