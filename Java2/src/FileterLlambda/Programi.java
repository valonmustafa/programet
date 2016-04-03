package FileterLlambda;

public class Programi {
	
	public static void main(String[] args) {
		String[] names={"valon","arianit","besim","idriz"};
		TextFilter textFilter= new TextFilter(names,name->name.startsWith("v"));
		textFilter.printo();
	}

}
