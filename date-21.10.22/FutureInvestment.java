package com.assignment;

import java.util.Scanner;

/*Q.3..Write a Java method to compute the future investment 
value at a given interest rate for a specified number 
of years. 

Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Outpu
Expected Output:

Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31 */
public class FutureInvestment {
public static void main(String [] args) {
	// user input
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the investment amount : ");
	int p = sc.nextInt(); // p for  investment amount
	System.out.println("Enter the rate of interest : ");
	float r = sc.nextFloat(); // r for  rate of interest
	System.out.println("Enter the number of years : ");
	int t = sc.nextInt(); // t for number of years
	
	int n= 12; //(Monthly compounded) as mention in question
	
	
	 //  printing 
	System.out.println("Years"+"        "+ "FutureValue " );
	
	// for loop
	 for(int i=1;i<=t;i++) {
		double value = p*(Math.pow((1+r/(n*100)),(n*i)));   //  compound interest formula A=P(1 + r/n)^nt 
		  System.out.println(i+"         "+value );
	 }
	 
}
}
