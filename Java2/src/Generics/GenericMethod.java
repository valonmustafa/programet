package Generics;

public class GenericMethod {
	
	public <E> void printElements(E[] elements){
		
		for (E e : elements) {
			System.out.printf("%s%n",e);
		}
	}
	
	public static <T> void checkType(T t){
		if (t instanceof Integer) {
			System.out.printf("%s%n","Une spunoj me integer");
		}
		
		else
			System.out.printf("%s%n",t);
	}

}
