package loop;

class Animal {
	void displayDetails() {
        System.out.println("Types: Dog,cat"); 
    }
}
class Dog extends Animal{
	void DogDetails() {
		System.out.println("Breed: Pug");
		System.out.println("Name: Vodafone");
		System.out.println("Age: 5");
	}
}
class Cat extends Animal{
	void CatDetails() {
		System.out.println("Breed: Cat");
		System.out.println("Name: Meow");
		System.out.println("Age: 6");
	}
}


