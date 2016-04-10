package Generics;

import java.util.Arrays;
import java.util.List;


public class ProgramGeneric {
	
	public static void main(String[] args) {
		
		GenericsDemo<Integer> integer= new GenericsDemo<>();
		integer.set(Integer.valueOf(3));
		System.out.printf("%d%n",integer.get());
		
		GenericsDemo<String> stringu= new GenericsDemo<>();
		stringu.set(String.valueOf("Pershendetje"));
		System.out.printf("%s%n",stringu.get());
		
		GenericsDemo<List<String>> lista= new GenericsDemo<List<String>>();
		List<String> list= Arrays.asList("test1","test2","test2");
		lista.set(list);
		
		System.out.printf("%s%n",lista.get());
		
		@SuppressWarnings("rawtypes")
		GenericsDemo gd= new GenericsDemo();
		
		
		//metoda gjenerike
		GenericMethod genericMethod= new GenericMethod();
		Double[] varguDouble={2.5,3.5,7.8,9.4};
		genericMethod.printElements(varguDouble);
		
		Character[] varguKaraktereve={'H','e','l','l','o'};
		genericMethod.printElements(varguKaraktereve);
		
		
		genericMethod.checkType(Integer.valueOf(3));
		genericMethod.checkType(String.valueOf("Hello"));
		
		
	}

}
