package dec12th;

import java.util.Collections;
import java.util.LinkedList;

// write a java program of swap two elements in a linked list
public class Problem2 {
public static void main(String[] args) {
	LinkedList<String> l1 = new LinkedList<String>();// create list
	l1.add("Mishab");
	l1.add("Avishek");
	l1.add("Atif");
	l1.add("Niladri");
	l1.add("Soumya");
	l1.add("Sourav");
	
	System.out.println(l1);
	
	System.out.println("After swap two elements at 1 and 3 index: ");
	Collections.swap(l1, 1, 3);
	System.out.println(l1);
}
}
