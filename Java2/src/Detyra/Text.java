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

}
