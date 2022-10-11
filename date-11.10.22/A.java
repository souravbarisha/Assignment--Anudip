package com.assignment;
/*Problem 2 :

Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)*/

//  ANS- This is a multi-level inheritance
// example --->>>

public class A {
	
void Alpha() {
	System.out.println("this is an alphabet");
}
}

class B extends A {
	
	
	void bita() {
		System.out.println("this is after A");
	}
}

class C extends B {
	
	void gama() {
		System.out.println("this is after B");
	}


public static void main(String []args) {
	A obA = new A();
	B obB = new B();
	C obC = new C();
	
	obC.Alpha();
	obC.bita();
	obC.gama();
	
}
}
