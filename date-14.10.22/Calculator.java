package com.assignment;

import java.util.Scanner;

//2.Write a java program to illustrate Calculator class with addition, subtraction,
//multiplication methods that can take any number of parameters to perform the operation,
//without using method/constructor overloading
public class Calculator {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		//user input
		System.out.println("Enter 1st number ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number ");
		int b = sc.nextInt();
		System.out.println("choose the operation ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case '+':
			System.out.println("Addition of two number is : "+ (a+b));
			break;
			
		case '-':
			System.out.println("subtraction of two number is : "+ (a-b));
			break;
			
		case '*':
			System.out.println("Multiplication of two number is : "+ (a*b));
			break;
			
		case '/':
			System.out.println("Division of two number is : "+ (a/b));
			break;
			
		case '%':
			System.out.println("modulus of two number is : "+ (a%b));
			break;
			
			default : 
				System.out.println("This is not Arithmetic Operator");
		}
}}
