package Det;

public class Detyra3 {

	public static void main(String[] args) {
	    
		int n1=0 ,n2=1,temp;
		
		System.out.print(n1+" "+n2);
		
		for (int i = 0; i < 51; i++) {
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.print(" "+temp);
		}
	}
}
