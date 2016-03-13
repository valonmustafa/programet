package Detyra;


public class Text {
	private String shkronja;
	private String[] emrat;
	public Text(String emrat[],String shkronja) {
		this.shkronja = shkronja;
		this.emrat= emrat;
	}

	public void Shfaq() {
		class Filter {
			public void shfaq() {
				for (int i = 0; i < emrat.length; i++) {
					if (emrat[i].startsWith(shkronja)) {
						String[]  list={emrat[i]};
						for (int j = 0; j < list.length; j++) {
							System.out.println(list[j]);
						}
					}
				
				}
			}

		}
		Filter f= new Filter();
		f.shfaq();
	}
	
	public void shfaq1(){
		 Filer filter= new Filer() {
			public void filter() {
				for (int i = 0; i < emrat.length; i++) {
					if (emrat[i].startsWith(shkronja)) {
						String[]  list={emrat[i]};
						for (int j = 0; j < list.length; j++) {
							System.out.println(list[j]);
						}
					}
				
				}
			}

		};
		
		filter.filter();
	}
	//klasata anonime munden me u deklaru edhe implementu ne kete forme
	public void shfaq2(){
		 new Filer() {
			public void filter() {
				for (int i = 0; i < emrat.length; i++) {
					if (emrat[i].startsWith(shkronja)) {
						String[]  list={emrat[i]};
						for (int j = 0; j < list.length; j++) {
							System.out.println(list[j]);
						}
					}
				
				}
			}

		}.filter();
	}
	
	public void shfaq3(){
		 Filer filter=() -> {
			
				for (int i = 0; i < emrat.length; i++) {
					if (emrat[i].startsWith(shkronja)) {
						String[]  list={emrat[i]};
						for (int j = 0; j < list.length; j++) {
							System.out.println(list[j]);
						}
					}
				
				}
		};
		filter.filter();
	}

}
