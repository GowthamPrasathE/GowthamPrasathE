package ATB6x;

public class Maximum2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1, 10},
						{4, 230},
						{700, 450}
				};
		int no_of_columns=2;
		int largest =  array [0][0];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<no_of_columns;j++) {
				if(array[i][j]>largest) {
					largest = array[i][j];
				}
			}
		}
		System.out.println(largest);
		System.out.println("HI");
		
	}
}
