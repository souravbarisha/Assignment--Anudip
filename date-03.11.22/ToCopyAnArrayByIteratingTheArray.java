package com.assignment;

import java.util.Arrays;

// Write a Java program to copy an array by iterating the array.
public class ToCopyAnArrayByIteratingTheArray {
public static void main(String[] args) {
	int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   int[] new_array = new int[10];     
	 
	   System.out.println("Source Array : "+Arrays.toString(my_array));     
	   
	   for(int i=0; i < my_array.length; i++) {
	    new_array[i] = my_array[i];
	}
	   System.out.println("New Array: "+Arrays.toString(new_array));
}
}