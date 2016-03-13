package Llambda;

public class Program {

	public static void main(String[] args) {
		IntegerMath mbledhja= (int a, int b) ->{
			return a+b;
		};
		
		IntegerMath zbritja=(a,b)->a+b;
		System.out.println("Shuma= "+mbledhja.operation(1, 3));
		System.out.println("Zbritja= "+zbritja.operation(2, 1));
		
	}

}
