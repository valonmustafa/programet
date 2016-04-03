package NumberString;

public class Shembull {
	public static void main(String[] args) {
		/*
		 * byte aByte = 10; byte bByte = 20;
		 * 
		 * byte c = (byte) (aByte + bByte); System.out.println("rezultati c: " +
		 * c);
		 */

		/*
		 * Byte a = new Byte((byte) 10); Byte b = new Byte((byte) 20);
		 * 
		 * byte aValue = a.byteValue(); byte bValu = b.byteValue();
		 * 
		 * System.out.println("a compare to b: "+a.compareTo(b));
		 * System.out.println("a equals to: "+a.equals(b));
		 * 
		 * Integer x= Integer.decode("0xff"); int x1=Integer.parseInt("2"); int
		 * x2= Integer.parseInt("F",16);
		 * 
		 * System.out.println("x= "+x.intValue()+" x1= "+x1+" x2= "+x2);
		 * 
		 * int x3=Integer.valueOf("1010",2); System.out.println("x3: "+x3);
		 */
		int k = 50;
		
		for (int i = 0; i < k; i++) {
			System.out.format("%d ",(int)(k+Math.random()*k));
		}
	}

}
