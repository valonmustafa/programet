public class FA extends Totali {

	private int ofera = 1;

	public FA(int cope, double cmimi) {
		super(cope, cmimi);
	}

	public int getOfera() {
		return ofera;
	}

	public void setOfera(int ofera) {
		this.ofera = ofera;
	}

	public double compute() {
		int calc = 0;
		double shuma = 0;
		if (getCope() > 2 && getCope() == getTotali()) {
			calc = getCope();
			shuma = getCmimi() * (getCope() - ofera);
		} else if (getCope() > 2 && getCope() < getTotali()) {

			calc = getCope() + ofera;
			setCope(calc);
			shuma = getCmimi() * (getCope() - 1);
		} else if (getCope() > 2 && getCope() > getTotali()) {
			System.out.println("Nuk mund t'i mbulojme kerkesat e juaja");
		}

		else {
			calc = getCope();
			shuma = getCmimi() * getCope();
		}

		System.out.println("Sasia: " + calc);
		System.out.println("Cmimi: " + shuma);
		return shuma;
	}

	public int totali() {
		int totali = 0;
		totali = getTotali() - getCope();
		System.out.println("Sasia e produktit te mbetur: " + totali);
		return totali;
	}

}
