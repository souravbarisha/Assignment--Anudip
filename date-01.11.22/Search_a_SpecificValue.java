package com.assignment;
//Q1. write a java program to test if an array contains a specific value.
import java.util.Scanner;

public class Search_a_SpecificValue {
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
	// enter the value
	System.out.println("Enter the value to find : ");
	int value = sc.nextInt();
	// search the value 
	boolean flag=true;
	int i;
	for( i=0; i<n; i++) {
		if(arr[i] == value) {
			flag = true;
			break;
		}
		else {
			flag=false;
		}
	}
	if (flag==true) {
	System.out.println(" YES...  "+value+" is there and The position is : "+ i);
	}
	else {
		System.out.println("the array is not contains with "+value);
	}
}
}
