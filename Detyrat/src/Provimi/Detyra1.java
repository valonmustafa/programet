package Provimi;

public class Detyra1 {
	public static void main(String[] args) {
		int a=5;
		int b=5;
		String s="*";
		String[][] vargu= new String[a][b] ;
		
		for (int i = 0; i < vargu.length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(vargu[i][j]=s);
			}
			System.out.println("");
			
		}
	}

}
