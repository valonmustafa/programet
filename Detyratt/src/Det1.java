


public class Det1 {

	public static void main(String[] args) {

		final int N = 8;
		int a[] = new int[N];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;

		int b[] = new int[N - 1];
		// kur e hjekim numrin 4
		for (int i = 0; i < a.length / 2; i++) {
			b[i] = a[i];
		}
		for (int i = a.length / 2; i < a.length - 1; i++) {
			b[i] = a[i + 1];
		}
		
		//kur e hjekim numrin 3
	/*	for (int i = 0; i < a.length / 2-1; i++) {
			b[i] = a[i];
		}
		for (int i = a.length / 2-1; i < a.length - 1; i++) {
			b[i] = a[i+1];
		}*/

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
