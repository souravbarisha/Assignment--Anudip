package dec12th;

import java.util.Iterator;
import java.util.LinkedList;
// write a java program to insert the specified element at the specified position in the linked list
public class Problem1 {
public static void main(String[] args) {
	LinkedList<String> l1 = new LinkedList<String>();// create list
	l1.add("Mishab");
	l1.add("Avishek");
	l1.add("Atif");
	l1.add("Niladri");
	l1.add("Soumya");
	l1.add("Sourav");
	
	System.out.println(l1);
	
	// insert an element at the specific position
	l1.add(4, "Puja"); // add (int index, element
	System.out.println("After insert: "+l1);
}
}
