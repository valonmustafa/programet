

public abstract class Totali {
	private int totali=100;
	private int cope;
	private double cmimi;
	
	public Totali(int cope, double cmimi) {
		this.cmimi= cmimi;
		this.cope= cope;
	}
	
	public double getCmimi() {
		return cmimi;
	}

	public void setCmimi(double cmimi) {
		this.cmimi = cmimi;
	}

	public Totali(int cope) {
		this.cope= cope;
	}

	public int getCope() {
		return cope;
	}

	public void setCope(int cope) {
		this.cope = cope;
	}
	
	public int totali(){
		return 0;
	}
	
	public double compute(){
		return 0.0;
	}

	public int getTotali() {
		return totali;
	}

	public void setTotali(int totali) {
		this.totali = totali;
	}
	
	
}
