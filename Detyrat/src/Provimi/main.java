package Provimi;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		Person person= new Person();
		
		System.out.println("Jepeni emrin tuaj: ");
		String emri =sc.next();
		person.setEmri(emri);
		
		System.out.println("Jepeni mbiemrin tuaj: ");
		String mbiemri=sc.next();
		person.setMbiemri(mbiemri);
		
		System.out.println("Jepeni vitin e lindjes");
		int viti=sc.nextInt();
		person.setVitiLindjes(viti);
		
/*		System.out.println("Jepeni diten tuaj te lindjes: ");
		int ditaLindjes= sc.nextInt();
		
		System.out.println("Jepeni muajin e lindjes: ");
		int muajitLindjes=sc.nextInt();
		
		System.out.println("Jepeni vitin e lindjes: ");
		int vitiLindjes=sc.nextInt();*/
		
		
		/*
		Calendar calendar= new GregorianCalendar(vitiLindjes, muajitLindjes, ditaLindjes);
		int viti=calendar.get(Calendar.YEAR);
		int muaji=calendar.get(Calendar.MONTH);
		int dita=calendar.get(Calendar.DAY_OF_MONTH);
		
		Calendar cal= Calendar.getInstance();
		
		cal.set(viti, muaji, dita);*/
		
		System.out.println("\nTe dhenat per personin");
		System.out.println(person.toString());
		person.calcAge(viti);
	}
}
