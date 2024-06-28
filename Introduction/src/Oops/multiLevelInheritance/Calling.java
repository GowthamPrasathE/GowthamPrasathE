package Oops.multiLevelInheritance;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Child -> father -> Grandfather

		Child test = new Child();
		test.home();
		Dad test2 = new Dad();
		test2.home();
		Grandfather test1 = new Grandfather();
		test1.home();

		// Dynamic dispatch

		Grandfather test4 = new Child();
		test4.home();

	}

}
