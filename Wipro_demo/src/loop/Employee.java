package loop;

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
    public static void main(String[] args) {
        
    }
}
