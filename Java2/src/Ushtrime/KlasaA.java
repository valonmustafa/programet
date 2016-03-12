package Ushtrime;

public class KlasaA {
	private int x=1;
	private static int y=2;
	
	class B{
		public void print() {
			System.out.println("x= "+x);
		}
	}
	
	static class C{
		public void print() {
			System.out.println("y= "+y);
		}
	}

}
