
public class DO extends Totali {

	private double ofera=0.25;
	
	public DO(int cope, double cmimi) {
		super(cope, cmimi);
	}

	public double getZbritja() {
		return ofera;
	}

	public void setZbritja(double ofera) {
		this.ofera = ofera;
	}
	
	public double compute(){
		double calc=0;
		double shuma=0;
		if (getCope()>2 && getCope()>getTotali()) {
			System.err.println("Nuk mund t'i permbushim kerkesat tuaja\n");
		}
		else if (getCope()>2 && getCope()<=getTotali()) {
			calc= getCmimi()*ofera;
		}
		shuma= (getCope()*getCmimi())-calc;
		System.out.println("Sasia: "+getCope());
		System.out.println("Cmimi me zbritje: "+shuma);
		return shuma;
	}
	
	public int totali(){
		int totali=0;
		totali=getTotali()-getCope();
		System.out.println("Sasia e produktit te mbetur: "+totali);
		return totali;
	}
	
	
	
	
}
