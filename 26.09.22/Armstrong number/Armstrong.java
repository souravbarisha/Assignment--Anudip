package com.assignment;

import java.util.Scanner;

public class Armstrong {
public static void min(String [] args) {
	Scanner sc = new Scanner(System.in);
//	user input
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	int originalNumber , remainder, result=0;
	originalNumber = number;
	while(originalNumber!=0) // using while loop
	{
		remainder = originalNumber %10; 
		result += Math.pow(remainder, 3);
		originalNumber = originalNumber / 10;
	}
	if(result == number) // to check result equal to number or not
	{
	 System.out.println(number +" is an armstrong number");
	}
	else 
		System.out.println(number +" is not an armstrong number");
}
}
