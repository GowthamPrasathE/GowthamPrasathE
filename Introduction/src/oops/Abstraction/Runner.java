package oops.Abstraction;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hiding the implementation class
		
		
		Chrome c1 = new Chrome();
		c1.startBrowser();
		c1.stopBrowser();

		Firefox f1 = new Firefox();
		f1.startBrowser();
		f1.stopBrowser();
	}

}
