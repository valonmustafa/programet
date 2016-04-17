package Generics;

import java.util.Arrays;
import java.util.List;

public class ProgramiUshtrime {
	
	
	public static void main(String[] args) {
		
		
		Figura<Double> figuraDouble= new Sphere<>(1.0);
		System.out.printf("Me double= %.2f%n",figuraDouble.calculateArea());
		
		Figura<Integer> figuraInteger= new Sphere<>(1);
		System.out.printf("Me integer= %.2f%n",figuraInteger.calculateArea());
		
		Figura<Short> figuraShort= new Sphere<>((short)1);
		System.out.printf("Me short= %.2f%n",figuraShort.calculateArea());
		
		GenericMethodUshtrime gmu= new GenericMethodUshtrime();
		
		Character[] array= {'h','e', 'l','l','o'};
		Character s='l';
		System.out.printf("%d%n",gmu.findOccurences(array, s));
		
		Integer[] ints={ 1,2,5,4,23,7,5,6,5,5};
		int e= 5;
		System.out.printf("%d%n",gmu.findOccurences(ints, e));
		
		String[] text= {"lapsi","lapsi","lapsi","tavolina"};
		String t="lapsi";
		System.out.printf("%d%n",gmu.findOccurences(text, t));
		
		List<Integer> shorts= Arrays.asList(1,2,3,1,2,5,2,41);
		gmu.printArray(shorts);
/*
		List<String> string= Arrays.asList("Valon","Arianit","Fitim","Betim");
		gmu.printArray(string);*/
	}

}
