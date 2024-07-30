package atb6x;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		char[] array = name.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		sc.close();

	}

}
