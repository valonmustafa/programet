package Generics;

//kur klasa gjenerike dojm me punu veq me numra <T extends Number>
public class Box<T> {

	public T t;
	public void add(T t){
		this.t=t;
	}
	
	public T get(){
		return this.t;
	}
	
	public<U extends Number>  void inspect(U u){
		
		//tregon tipin
		System.out.printf("%s%n",u.getClass().getName());
		//shtypmi vleren e plote
		System.out.printf("%d%n",u.intValue());
	}
}
