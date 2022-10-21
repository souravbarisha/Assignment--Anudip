package com.assignment;
/* Q.1...Write a Java program that reads in two floating-point 
numbers and tests whether they are the same up to 
three decimal places.*/
import java.util.Scanner;

public class Floating_point {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two floating point number:");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		a=(float) (Math.round(a*Math.pow(10,3))/Math.pow(10,3));
		b=(float) (Math.round(b*Math.pow(10,3))/Math.pow(10,3));
		if(a==b)
			System.out.println("The number are same up to three decimal places.");
			else
			System.out.println("The number are not the same.");
		}
}
