package Generics;

public class GenericsDemo<T> {

	
	private T t;
	
	public void set(T t){
		this.t=t;
	}
	
	public T get(){
		return this.t;
	}
}
