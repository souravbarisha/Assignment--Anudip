package dec12th;

import java.util.Collections;
import java.util.LinkedList;

// write a java program to shuffle the elements in a linked list
public class Problem3 {
public static void main(String[] args) {
	LinkedList<String> l1 = new LinkedList<String>();// create list
	l1.add("Mishab");
	l1.add("Avishek");
	l1.add("Atif");
	l1.add("Niladri");
	l1.add("Soumya");
	l1.add("Sourav");
	
	System.out.println(l1);
	
	
	System.out.println("After shuffle the elements: ");
	Collections.shuffle(l1);
	System.out.println(l1);
	// again shuffle
//	System.out.println("After shuffle the elements: ");
//	Collections.shuffle(l1);
//	
	
}
}
