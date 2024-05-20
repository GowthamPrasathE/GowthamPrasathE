package ATB6x;

public class Maximum2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
				};
		int largest =  array [0][0];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<i;j++) {
				if(array[i][j]>largest) {
					largest = array[i][j];
				}
			}
		}
		System.out.println(largest);
	}
}
