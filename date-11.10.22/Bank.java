package com.assignment;
/*Problem 3:

Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.*/
public class Bank {


class SBI extends Bank {
	 void rateOfInterest(int rate) {
		System.out.println("rate of interest OF SBI is : "+ rate+"%");
	}	
}
class ICICI extends Bank {
	void rateOfInterest(int rate) {
		System.out.println("rate of interest OF ICICI is : "+ rate+"%");
	}
}
class AXIS extends Bank {
	void rateOfInterest(int rate) {
		System.out.println("rate of interest OF AXIS is : "+ rate+"%");
	}
}

public static void main(String []args) {
	Bank B = new Bank();
	SBI S = B.new SBI();
	ICICI I = B.new ICICI();
	AXIS A = B.new AXIS();
	S.rateOfInterest(8);
	I.rateOfInterest(7);
	A.rateOfInterest(9);
}
}
