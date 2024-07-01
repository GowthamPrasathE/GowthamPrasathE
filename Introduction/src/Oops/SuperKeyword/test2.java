package Oops.SuperKeyword;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		batsman test2 = new batsman();

		batsman test = new batsman("23");
		test.dispaly();

		batsman test1 = new batsman("23", "72");
		test1.dispaly();

		batsman test4 = new batsman("23", "72", "98");
		test4.dispaly();

		// Whenever a child has DC automatically parent's DC is also called
	}
}

class cricket {
	String number;
	String score;
	String average;

	cricket() {
		System.out.println("Cricket DC");
	}

}

class batsman extends cricket {

	batsman() {
		super();
		System.out.println("Batsman DC");
	}

	batsman(String number) {
		this.number = number;
	}

	batsman(String number, String score) {
		this("54");
		this.score = score;

	}

	batsman(String number, String score, String average) {
		this("45", "65");
		this.average = average;

	}

	void dispaly() {
		System.out.println("Batsman score is " + score + " and number is " + number + " and average is " + average);
	}

}
