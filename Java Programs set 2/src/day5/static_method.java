package day5;

public class static_method {
	static void subtract(int a,int b) {
		static_method.subtract(a, b);
	}
	void display() {
		System.out.println("I am static method");
	}
	public static void main(String[] args) {
		static_method s1 = new static_method();
		s1.display();
		//int x= 5;
		//int y=6;
		static_method.subtract(5,6);
		
	}

}
