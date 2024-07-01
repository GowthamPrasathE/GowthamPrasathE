package Exceptions;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Bank Sbi = new Bank("123", 10);
		Bank Icici = new Bank("23", 20);
		Bank Axis = new Bank("23", 40);
		//Integer total = Sbi.add(Icici);
		Integer total2 = Icici.add(Axis);
		//System.out.println(total);
		System.out.println(total2);
	}

}
