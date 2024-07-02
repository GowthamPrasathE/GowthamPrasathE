package oops.Abstraction.Interface;

public class Car implements Brake, Engine {

	@Override
	public void Enginefn() {
		System.out.println("START and STOP ENGINE");

	}

	@Override
	public void Brakefn() {
		// TODO Auto-generated method stub
		System.out.println("APPLY BRAKE");
	}

}
