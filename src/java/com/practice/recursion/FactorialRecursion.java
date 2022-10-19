package java.com.practice.recursion;

public class FactorialRecursion {
	static int factorial(int n) {
		return n==0 ? 1:(n*factorial(n-1));
	}

	public static void main(String args[]) {
		int i, fact = 1;
		int number = 3;// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
