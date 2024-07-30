package oops.Abstraction.Interface;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.Brakefn();
		c1.Enginefn();

		Tesla t1 = new Tesla();
		t1.Brakefn();
		t1.Enginefn();
	}

}
