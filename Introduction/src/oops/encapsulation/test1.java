package oops.encapsulation;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hiding the data members
		
		// Getter setters are used beacuse the data members are private
		
		// We are securing data members by using conditions in setters

		ICICI i1 = new ICICI("Gowtham", 100);
		System.out.println(i1.getBal());
		i1.setBal(-100);
		System.out.println(i1.getBal());
	}
}

class ICICI {

	private String name;
	private int bal;

	ICICI(String name, int i) {
		this.name = name;
		this.bal = i;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		if (bal > 0) {
			this.bal = bal;
		} else {
			System.out.println("Not allowed");
		}
	}

}
