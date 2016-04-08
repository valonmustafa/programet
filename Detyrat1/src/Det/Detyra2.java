package Det;

public class Detyra2 {

	public static void main(String[] args) {
		int[] List = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
		String c= "\u00B0";

		
		for (int i = 0; i < List.length; i++) {
			float f=(float) (List[i]*1.8+32);
			System.out.printf("%n("+List[i]+c+"C)"+" ("+f+c+"F)");
			
			
		}

	}
}
