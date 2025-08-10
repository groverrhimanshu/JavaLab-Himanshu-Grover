package loop;

class Vehicles {
	void displayDetails() {
        System.out.println("Types: Car,Bike");
        System.out.println("Wheeler: 4,2" );
        
    }
}
class Carz extends Vehicles{
	void CarDetails() {
		System.out.println( "Name: Mercedes");
		System.out.println( "Color: Black");
	}
}
class Bikez extends Vehicles{
	void BikeDetails() {
		System.out.println( "Name: Royal Enfield");
		System.out.println( "Color: Black");
	}
}
