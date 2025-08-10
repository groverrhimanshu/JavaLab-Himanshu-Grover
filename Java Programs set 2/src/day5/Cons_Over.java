package day5;

public class Cons_Over {
	String name;
    int age;
	Cons_Over() {
        name = "Himanshu";
        age = 23;
    }
	Cons_Over(String name) {
        this.name = name;
        age = 18;
    }
	public void display() {
        System.out.println(name+" - "+age);
    }

	public static void main(String[] args) {
		Cons_Over s1 = new Cons_Over();
		Cons_Over s2 = new Cons_Over("Grover");
		s1.display();
		s2.display();

	}

}
