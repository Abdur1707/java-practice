package java.com.practice.recursion;

public class FactorialRecursion {
	static int factorial(int n) {
		return n==0 ? 1:(n*factorial(n-1));
	}

	public static void main(String args[]) {
		int number = 3;// It is the number to calculate factorial
		System.out.println("Factorial of " + number + " is: " + factorial(number));
	}
}
