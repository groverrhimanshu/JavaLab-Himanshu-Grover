package loop;

public abstract class Vehicle {
	abstract void startEngine();
}
class cars extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}
class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started with self-start button.");
    }
}