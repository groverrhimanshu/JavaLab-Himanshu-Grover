package loop;

public class MessageSenderResult {

	public static void main(String[] args) {
		MessageSender m1 = new Email();
		m1.display();
		
		MessageSender m2 = new Sms();
		m2.display();
		
		

	}

}
