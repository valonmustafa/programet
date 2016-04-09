package DetyratProfi;

public class Fibonacci {

	public static void main(String[] args) {

		final byte START = 48;
		long nr1 = 0;
		long nr2 = 1;
		long nr3 = 0;

		System.out.printf("%d%n",nr1);
		System.out.printf("%d%n",nr1);

		for (int i = 0; i < START; i++) {
			nr3 = nr1 + nr2;
		
			System.out.printf("%d gr= %.12f%n",nr3,(double)nr3/(double)nr2);
			nr1 = nr2;
			nr2 = nr3;
		}

	}

}
