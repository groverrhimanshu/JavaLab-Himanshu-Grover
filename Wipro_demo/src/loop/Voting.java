package loop;

public class Voting {
	private String voterName;
    private String voterID;
    private boolean hasVoted;
    public Voting(String name, String id) {
        this.voterName = name;
        this.voterID = id;
        this.hasVoted = false; 
    }
    public void castVote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println(voterName + " (ID: " + voterID + ") has successfully voted.");
        } else {
            System.out.println(voterName + ", you have already voted.");
        }
    }
    public boolean hasVoted() {
        return hasVoted;
    }
    public void showVoterInfo() {
        System.out.println("Voter ID: " +voterID);
    }
    
    
    public class Employee {
	    private double salary;
	    public Employee(double salary) {
	        this.salary = salary;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) 
	        {
	            this.salary = salary;
	        } 
	    
	    public void showDetails() {
	        System.out.println("Employee salary: ₹" + salary);
	    }

    }}
