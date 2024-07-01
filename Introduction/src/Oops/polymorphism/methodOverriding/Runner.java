package Oops.polymorphism.methodOverriding;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method overriding occurs when a subclass (child class)
		// has the same method as the parent class [Bark()]

		Dog d1 = new Dog();
		d1.bark();

		Dog d2 = new Hound(); // Run time polymorphism
		d2.bark();
	}

}
