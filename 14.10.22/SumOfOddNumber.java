package com.assignment;

import java.util.Scanner;

//1.write a java program to print sum of odd numbers upto N?
public class SumOfOddNumber {
	
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the to get sum of odd number upto it : ");
	int N = sc.nextInt();
	int sum=0;
	for(int i=1; i<=N; i++) {
		if(i%2 !=0) {
			sum+=i;
		}
	}
	System.out.println("sum of odd number upto "+N + " is : "+ sum);
}
}
