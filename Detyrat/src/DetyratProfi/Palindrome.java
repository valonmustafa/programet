package DetyratProfi;

public class Palindrome {

	public String revers(String text) {
		int len = text.length();
		char[] reverseArray = new char[len];

		for (int i = 0; i < len; i++) {
			reverseArray[i] = text.charAt(len - i - 1);
		}
		return new String(reverseArray);

	}

	public boolean isPalindrome(String text) {
		if (text.length() > 1) {
			String reverseText = revers(text);
			return reverseText.equalsIgnoreCase(text);
		}
		return false;
	}

}
