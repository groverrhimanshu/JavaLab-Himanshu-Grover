package loop;

public class Car {
	private boolean isEngineworking;
	private String FuelLevel;
	private int trainspeed;
	
	public void setCar(String fuel,int speed,boolean engine){
		this.FuelLevel = fuel;
		this.trainspeed = speed;
		this.isEngineworking=engine;
	}

	public String getCar() {
		return FuelLevel;	
	}
	public boolean getcar() {
		return true;	
	}
	public int getar() {
		return trainspeed;	
	}
	public void displayinfo() {
		System.out.println("high");
		System.out.println("Yes working properly");
		System.out.println("120km/h");
		
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
	}
}
