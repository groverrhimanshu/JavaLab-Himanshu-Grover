package wd;

public interface Vehicles {
	void start();

    default void fuelType() {
        System.out.println("Default fuel: Petrol");
    }
}

class Car implements Vehicles {
    public void start() {
        System.out.println("Car started!");
    }
}

public class mains {
    public static void main(String[] args) {
        Vehicles v = new Car();
        v.start();        
        v.fuelType();     
    }

}
