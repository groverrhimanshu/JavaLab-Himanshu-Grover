package loop;

class MessageSender {
	void display() {
		System.out.println("Message Sender Types");
	}
}
class Email extends MessageSender{
	void display() {
		System.out.println("Message Sender Type:  Email");
	}
}
class Sms extends MessageSender{
	void display() {
		System.out.println("Message Sender Type:  SMS");
	}
}