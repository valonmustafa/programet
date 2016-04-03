package Stringjet;

public class Ushtrime {
	public static void main(String[] args) {

		String teksti = "Kjo dite pranvere me mundon";

		String[] fjalet = teksti.split(" ");

		for (String fjala : fjalet) {

			System.out.printf("%s%n", fjala);
		}

		String path = "C:\\documents\\tekst.doc";
		
		for (String string : path.split("\\\\")) {
			System.out.println(string);
		}

		int beginIndex = path.lastIndexOf(".");

		String extension = path.substring(beginIndex);

		System.out.printf("Prapashtesa e fajllit eshte %s%n", extension);

		char c = '\u00BC';
		System.out.printf("%s%n", c);
		System.out.printf("%s%n", (int) c);

		char a = 'A';
		System.out.printf("%s%n", a);
		System.out.printf("%s%n", (int) a);

		String s1 = new String("total number of students");
		String s2 = new String("number");
		
		System.out.printf("%b%n",s1.regionMatches(6, s2, 0, 6));

	}

}
