package Oops.SuperKeyword;

public class test1 {

	public static void main(String[] args) {

		truck t = new truck();
		t.message();
	}

}

class truck extends vehicle {
	int speed = 200;

	void message() {
		System.out.println("This is Truck and its speed is " + this.speed);
		System.out.println("This is Car and its speed is " + super.speed);
	}
}

class vehicle {
	int speed = 100;

	void message() {
		System.out.println("This is vehicle class");
	}

}
