package DetyratProfi;

public class Program {

	public static void main(String[] args) {
		
		final int START=1_000;
		final int END=10_000;
		
		Palindrome p= new Palindrome();
		int count=0;
		
		for (int i = START; i <=END; i++) {
			String text= String.valueOf(i);
			if (p.isPalindrome(text)) {
				System.out.printf("%s%n",text);
				count++;
			}
		}
		System.out.println("Numri i palindromeve eshte = "+count);
	}
}
