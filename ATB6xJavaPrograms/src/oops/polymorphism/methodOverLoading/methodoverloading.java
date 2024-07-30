package oops.polymorphism.methodOverLoading;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multiple methods with same name but different parameters

		methodoverloading m1 = new methodoverloading();

		methodoverloading m2 = new methodoverloading("Gowtham", "Prasath");

		methodoverloading m3 = new methodoverloading("Gowtham");

	}

	public String a;
	public String b;

	methodoverloading() {
		System.out.println("Method with one parameter");
	}

	methodoverloading(String a) {

		System.out.println("Method with one parameters " + a);
	}

	methodoverloading(String a, String b) {

		System.out.println("Method with two parameters " + a + " " + b);

	}
}
