package nov18;
//Q-3
public class CheckPositive {
	public static void addTwoPositive(int x, int y) throws ArithmeticException {
		if(x<0 || y<0) {
			throw new ArithmeticException("Non-positive integer sent");
		}
		else {
			System.out.println("sum of two number is : "+ (x+y));
		}
	}
public static void main(String[] args)throws ArithmeticException {
	addTwoPositive(-2,6);
}
}
