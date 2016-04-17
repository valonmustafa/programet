package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgramGeneric {

	public static void main(String[] args) {
		/*
		 * GenericsDemo<Integer> integer= new GenericsDemo<>();
		 * integer.set(Integer.valueOf(3));
		 * System.out.printf("%d%n",integer.get());
		 * 
		 * GenericsDemo<String> stringu= new GenericsDemo<>();
		 * stringu.set(String.valueOf("Pershendetje"));
		 * System.out.printf("%s%n",stringu.get());
		 * 
		 * GenericsDemo<List<String>> lista= new GenericsDemo<List<String>>();
		 * List<String> list= Arrays.asList("test1","test2","test2");
		 * lista.set(list);
		 * 
		 * System.out.printf("%s%n",lista.get());
		 * 
		 * @SuppressWarnings("rawtypes") GenericsDemo gd= new GenericsDemo();
		 * 
		 * 
		 * //metoda gjenerike GenericMethod genericMethod= new GenericMethod();
		 * Double[] varguDouble={2.5,3.5,7.8,9.4};
		 * genericMethod.printElements(varguDouble);
		 * 
		 * Character[] varguKaraktereve={'H','e','l','l','o'};
		 * genericMethod.printElements(varguKaraktereve);
		 * 
		 * 
		 * genericMethod.checkType(Integer.valueOf(3));
		 * genericMethod.checkType(String.valueOf("Hello"));
		 */

		// Integer eshte argument
		Box<Integer> boxInteger = new Box<Integer>();
		boxInteger.add(10);

		System.out.printf("%d%n", boxInteger.get());

		Box<Double> boxDouble = new Box<Double>();

		boxDouble.add(10.5);
		System.out.printf("%.2f%n", boxDouble.get());
		
		Box<String> boxString= new Box<String>();
		boxString.add("Hello");
		System.out.printf("%s%n",boxString.get());
		
		boxString.inspect(Double.valueOf(10.7));
		
		A a= new A();
		
		Double[] d= {2.1,3.9,2.3,5.0,7.9,10.6};
		Double e= 3.5d;
		
		a.countElementsGreaterThan(d, e);
		System.out.printf("%s%n",a.countElementsGreaterThan(d, e));
		
		
		
		//Integer eshte subtype i number Number eshte supertip
		Number n= new Integer(5);
		
		Object obj= new Integer(10);
		
		System.out.printf("%d%n",n);
		System.out.printf("%d%n",obj);
		
		//Box<Integer> nuk eshte nentip (subtype) i Box<Number>
		//Box<Number> boxNumber= new Box<Integer>();
		//Object eshte supertip i tipeve
		Object boxNumber= new Box<Integer>();
		boxInteger.add(Integer.valueOf(15));
		System.out.printf("%d%n",boxInteger.get());
		
		Cube<Integer, Integer> c= new Cube<Integer, Integer>();
		c.calculateArea(6);
		System.out.printf("%d%n",c.calculateArea(6));
		

	}

}
