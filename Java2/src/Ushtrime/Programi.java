package Ushtrime;

public class Programi {
	
	public static void main(String[] args) {
		
		KlasaA a= new KlasaA();
		
		KlasaA.B b=a.new B();
		b.print();
		
		KlasaA.C c= new KlasaA.C();
		c.print();
		
		D d= new D("tung");
		d.print();
		d.print2();
	}

}
