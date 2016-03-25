public class TextSorto {
	private String[] emrat;
	private String filtro;

	public TextSorto(String[] emrat, String filtro) {
		this.emrat = emrat;
		this.filtro = filtro;
	}

	public void shfaq() {

		
		Sorter s = ()-> {
			String temp;

 {
				for (int i = 0; i < emrat.length; i++) {
					for (int j = i + 1; j < emrat.length; j++) {
						if (filtro.equals("ASC")||filtro.equals("asc") ) {
							if (emrat[j].compareTo(emrat[i]) < 0) {
								temp = emrat[i];
								emrat[i] = emrat[j];
								emrat[j] = temp;
							}

						} else if (filtro.equals("DESC")||filtro.equals("desc")) {
							if (emrat[j].compareTo(emrat[i]) > 0) {
								temp = emrat[i];
								emrat[i] = emrat[j];
								emrat[j] = temp;
							}
						}

					}
					System.out.println(emrat[i]);
				}

			}
		};
		s.sorto();

	}

}
