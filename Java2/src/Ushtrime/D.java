package Ushtrime;

public class D {

	private String message;

	public D(String message) {
		this.message = message;
	}

	public void print() {
		class MessageEng {
			public void print() {
				System.out.println(message+ " ENG");
			}

		}

		class MessageGer {
			public void print() {
				System.out.println(message+ " GER");
			}
		}

		MessageEng messageEng = new MessageEng();
		MessageGer messageGer = new MessageGer();

		messageEng.print();
		messageGer.print();

	}
	
	public void print2(){
		String a="vlera a";
		Message msg= new Message() {
			
			@Override
			public void print() {
				System.out.println(message+" "+a);
			}	
		};
		msg.print();
	}
}
