package ATB6x;

import java.util.Scanner;

public class TransposeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] Array = new int[3][3];

		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				Array[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print(Array[i][j] + " ");

			}
			System.out.println();

		}

		int[][] transpose = new int[3][3];
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				transpose[j][i] = Array[i][j];
			}
			
		}
		System.out.println();

		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
