package FileterLlambda;

public class TextFilter  {
	private String[] names;
	private Filtro filtro;
	
	public  TextFilter(String[] names, Filtro filtro){
		this.names= names;
		this.filtro= filtro;
	}
	
	public void printo(){
		for (String name : names) {
			if (filtro.check(name)) {
				System.out.println(name);
			}
		}
	}
	

	


}
