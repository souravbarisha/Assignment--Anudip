package nov18;
//Q-1

class MyException extends Exception{
	public MyException(String pallabi) {
		super(pallabi);
	}
}

public class AllExceptionExample {
	
public static void main(String[] args)throws ArithmeticException {
	
	try {// outer try block
		// * division by zero (ArithmeticException)
		try {
			
			int div = 15/0 ;
			
		}
		catch(ArithmeticException e){
			System.out.println(e+" Invalid division");
			System.out.println("Exception encountered");
		}
		// * String passed to a numeric variable
		try {
			
			 int a = Integer.parseInt("sourav");
	            System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println(e+" Format mismatch");
			System.out.println("Exception encountered");
		}
		// * Accessing an invalid index in string
		try {
			String str = "sourav"; 
			//System.out.println(str.length()); // length is 6
			System.out.println(str.charAt(7)); // but call 7th ele , that's why exception will occur
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e+" Index is invalid");
			System.out.println("Exception encountered");
		}
		// * Accessing an invalid index in Array
		try {
			int a[] = new int [5];
			a[6] =4; // assigning the value out of array bounds
		}
		catch(ArrayIndexOutOfBoundsException e) { 
		System.out.println(e+" Array Index is invalid");
		System.out.println("Exception encountered");
	    }
		// MyException 
		try {
			
			throw new MyException("MyException[pallabi]");
			
		}
		catch(MyException e) {
			System.out.println(e);
		}
		
		
	}
	catch(Exception e) {// outer catch block
		System.out.println(e);
	}
	finally {
		System.out.println("Exception Handing completed");
	}
	
}
}
