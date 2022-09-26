package com.assignment;

import java.util.Scanner;

public class Arithmetic {
public static void main(String[] args) {
//	float number 
	
	Scanner sc = new Scanner(System.in);
	
//	user input 
	System.out.println("Enter the 1st float number");
	float f1 = sc.nextFloat();
	
	System.out.println("Enter the 2nd float number");
	float f2 = sc.nextFloat();
//	multiple of two float numbers
	float f = f1*f2;
	System.out.println("multiple of two float numberss is : "+ f);

//	natural number 
	
//	user input
	System.out.println("Enter the 1st number");
	int n1 = sc.nextInt();
	
	System.out.println("Enter the 2nd number");
	int n2 = sc.nextInt();
	
//	adding
	int sum= n1+n2;
	System.out.println("sum of two numbers is : "+sum);
	
//	multiple of two natural numbers
	int mul = n1*n2;
	System.out.println("multiple of two numbers is : "+mul);
	
	
}
}
