

public class Programi {
	public static void main(String[] args) {
		final double CMIMI = 2;
		int cope = 10;
		DO d = new DO(cope, CMIMI);
		d.compute();
		d.totali();
		FA f = new FA(cope, CMIMI);
		f.compute();
		f.totali();

	}
}
