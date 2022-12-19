package ArraysAlogorithms;

public class Recursion {
	public static void main(String[] args) {
		int a=factorial(6);
		System.out.println(a);
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n* factorial(n-1);
	}
}
