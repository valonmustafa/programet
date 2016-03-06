package Provimi;

public class Detyra3 {
	public static void main(String[] args) {
		
		int count1=0;
		int count2=0;
		int count3=0;
		final int nr1=1;
		final int nr2=2;
	
		int[] vargu={1,1,2,1,3,2,1,3,3,3,1,2,1,1,2,2,2,3,1,1,1};
		
		for (int i = 0; i < vargu.length; i++) {
			if (vargu[i]==nr1) {
				count1++;
			}
			else if(vargu[i]==nr2){
				count2++;
			}
			else{
				count3++;
			}
			
		}
		System.out.println("Vargu permban: ");
		System.out.println(count1+" njesha");
		System.out.println(count2+" dysha");
		System.out.println(count3+" tresha");
	}
	

}
