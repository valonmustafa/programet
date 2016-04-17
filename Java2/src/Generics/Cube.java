package Generics;

public class Cube<U extends Number, T> extends Box<T> {

	public Integer calculateArea(U u) {
		return u.intValue() * u.intValue() * Integer.valueOf(6);
	}

}
