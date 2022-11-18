package nov18;
//Q-3
public class MyCalculator {
	public static long power(int n, int p) throws Exception {
		if(n<0 || p<0) {
			throw new Exception("n or p should not negative");
		}
		else if(n==0 && p==0) {
			throw new Exception("n and p should not be zero");
		}
		
		return n^p;
		
	}
public static void main(String[] args) throws Exception {
	System.out.println(power(-5,2));
}
}
