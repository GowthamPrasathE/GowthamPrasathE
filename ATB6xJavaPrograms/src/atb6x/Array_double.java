package atb6x;
import java.util.Arrays;
public class Array_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		int[] doubledArray= new int [array.length];
		for (int i=0;i<array.length;i++) {
			doubledArray[i]=array[i]*2;
		}
		System.out.println("Array: "+Arrays.toString(array));
		System.out.println("Doubled Array: "+Arrays.toString(doubledArray));
	}

}
