package com.assignment;

import java.util.Scanner;

// write a java program to find the duplicate values of an array of integer values.
public class FindDuplicateValue {
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
	
	boolean flag = true;
	int i;
	int j;
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				flag =true;
				break;
			}
			
			else {
				flag = false;
			}
		}
	}
	if(flag==true) {
		System.out.println("Duplicate value = "+ arr[i]);
	}
	else {
		System.out.println("there are no duplicate value");
	}
	
}
}
