package Generics;

public class Sphere<T extends Number> implements Figura<T> {

	private final int COEFFICIENT=4,EXPONENT=2;
	
	private T t;
	
	public Sphere(T t){
		this.t=t;
	}
	
	public void add(T t){
		this.t= t;
	}
	
	@Override
	public double calculateArea() {
		return COEFFICIENT * Math.PI * Math.pow(t.doubleValue(), EXPONENT);
	}

}
