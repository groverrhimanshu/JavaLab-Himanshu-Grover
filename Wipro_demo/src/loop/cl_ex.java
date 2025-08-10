package loop;
import java.util.Scanner;

public class cl_ex {
	
//1.  withdraw and deposit	
/*	int deposit;
	int withdraw;
	
	void start() {
		System.out.println("Your account details");
	
	}
	void displayinfo() {
		System.out.println("deposit amount: "+deposit);
		System.out.println("withdrawal amount: "+withdraw);
		System.out.println("Remaining amount: " +(deposit-withdraw));
			
	}
	

	public static void main(String[] args) {
		cl_ex c1 = new cl_ex();
		c1.deposit = 2000;
		c1.withdraw = 500;
		
		c1.start();
		c1.displayinfo();

	}*/
	//2.  employee details	
	/*String name;
	String department;
	int id;
	int age;
	
	void start() {
		System.out.println("Employee details: ");
	}
	void displayinfo() {
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("Employee id: "+ id);
		System.out.println("Age: "+ age);
			
	}
	public static void main(String[] args) {
		cl_ex c1 = new cl_ex();
		c1.name = "Himanshu";
		c1.department = "Automation Testing";
		c1.id = 100;
		c1.age = 23;
		c1.start();
		c1.displayinfo();

	}*/
	
	//3. book details
	/*String authorname;
	String subject;
	int id;
	int price;
	
	void start() {
		System.out.println("Book details: ");
	}
	void displayinfo() {
		System.out.println("Author Name: "+authorname);
		System.out.println("subject: "+subject);
		System.out.println("book id: "+ id);
		System.out.println("Price: "+ price);
			
	}
	public static void main(String[] args) {
		cl_ex c1 = new cl_ex();
		c1.authorname = "Himanshu";
		c1.subject = "Automation Testing";
		c1.id = 100;
		c1.price = 2300;
		c1.start();
		c1.displayinfo();

	}*/
	
	// 4. drive
	String filename1;
	String filename2;
	int memory_used1;
	int memory_used2;
	
	
	void start() {
		System.out.println("Upload and download files from here: ");
	}
	void displayinfo() {
		System.out.println("File Name: "+filename1);
		System.out.println("File Name: "+filename2);
		System.out.println("memory of 1st file: "+memory_used1);
		System.out.println("memory of 2nd file: "+memory_used2);	
	}
	
	
	public static void main(String[] args) {
		cl_ex c1 = new cl_ex();
		c1.filename1 = "Misc";
		c1.filename2 = "Disc";
		c1.memory_used1 = 25;
		c1.memory_used2 = 45;
		
		c1.start();
		c1.displayinfo();
		
		

	}
	// 5. chatbot
	/*public String getResponse(String userInput) {
        userInput = userInput.toLowerCase();

        if (userInput.contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (userInput.contains("how's you")) {
            return "very good";
        } 
         else {
            return "not able to understand";
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        cl_ex bot = new cl_ex();

        
        System.out.print("You: ");
        String userMessage = sc.nextLine();

        
        String botReply = bot.getResponse(userMessage);

        
        System.out.println("Bot: " + botReply);

        sc.close();
    }*/
}
