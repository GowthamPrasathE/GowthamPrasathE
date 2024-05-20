package ATB6x;

public class Array_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] salary = {30,50,60,90,10,100,999};
		int largest = salary[0];
		for(int i=1;i<salary.length;i++) {
			if(salary[i]>largest) {
				largest=salary[i];
			}
			
		}
		System.out.println(largest);
		
	}

}
