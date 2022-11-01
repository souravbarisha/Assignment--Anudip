package com.assignment;

import java.util.Scanner;

// we need to print the elements of the array which are present in odd position
public class PrintOddPosition {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	// user input
	System.out.println("Enter the length of an Array : ");
	int n = sc.nextInt();
	int [] arr = new int[n];
	n= arr.length;
   System.out.println("Create an Array with some value : ");
	for(int i=0; i<n; i++) {
		arr[i]= sc.nextInt();
	}
	// array display
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+", ");
	}
	System.out.println();
	System.out.println("only printing the elements of the array which are present in odd position : ");
	for(int i=0;i<n;i=i+2) {// for odd position
		System.out.print(arr[i]+", ");
	}
}
}
