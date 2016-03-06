package Provimi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Person {

	private String emri;
	private String mbiemri;
	private int vitiLindjes;
	private final int VITI_AKTUAL=2016;
	
	public Person(){
		
	}
	public Person(String emri, String mbiemri, int vitiLindjes){
		this.emri=emri;
		this.mbiemri=mbiemri;
		this.vitiLindjes=vitiLindjes;
	}
	
	
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public String getMbiemri() {
		return mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public int getVitiLindjes() {
		return vitiLindjes;
	}
	public void setVitiLindjes(int vitiLindjes) {
		this.vitiLindjes = vitiLindjes;
	}
	
	
	public int calcAge(int vitiLindjes){
/*		int rez=0;
		Calendar cal=Calendar.getInstance();
		int viti= vitiLindjes.getYear()+1900;
		int muaaji= vitiLindjes.getMonth();
		int dita= vitiLindjes.getDate();
		
		cal.set(viti,muaaji,dita);

		Calendar now= Calendar.getInstance();
		
		int v=now.get(Calendar.YEAR);
		int m=now.get(Calendar.MONTH)+1;
		int d= now.get(Calendar.DAY_OF_MONTH);
		
		
		if (d>=dita && m>=muaaji) {
			rez=v-viti;
		}
		else if(d>=dita && m<muaaji){
				rez=v-viti-1;
		}
		else if(d<dita && m>muaaji){
				rez=v-viti;
		}
		else{
			rez=v-viti-1;
		}
		
		System.out.println("Mosha: "+rez);
		return rez;	*/
		
		return VITI_AKTUAL-vitiLindjes;
	}
	
	public String toString(){
		return "Emri: "+getEmri()+"\nMbiemri: "+getMbiemri();
	}
}
