package loop;

class Employe {
    
    
    void displayDetails() {
        System.out.println("Employee ID: 1234" );
        System.out.println("Name: Himanshu" );
        System.out.println("Salary: ₹50000" );
    }
}
class Manager extends Employe {

    void conductMeeting() {
        System.out.println( "Manager is conducting a team meeting with members.");
    }
}

// Subclass: Developer
class Developer extends Employe {  

    void writeCode() {
        System.out.println("Developer is writing code in Java");
    }
}