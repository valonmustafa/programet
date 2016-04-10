package Ushtrime;

public class Factorial {

	public static void main(String[] args) {

		int factorial = 1;
		final int N = 5;
		for (int i = 1; i <= N; i++) {
			factorial = factorial * i;
		}
		System.out.printf("Factorial(%d)=%d",N,factorial);
	}

}
