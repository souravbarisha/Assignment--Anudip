package com.assignment;
//Q.2..Write a program in Java to display the cube of the number
//upto given an integer..
import java.util.Scanner;

public class Cube {
	public static void main(String [] args) {
		// user input
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to get upto this in cube form: ");
		int num = sc.nextInt();
		System.out.println("Cube of upto "+num+"  are : ");
          //used for loop
		for(int i=1; i<=num;i++) {
			
			System.out.println(i+"^3 = "+ i*i*i );
		}

	}
}
