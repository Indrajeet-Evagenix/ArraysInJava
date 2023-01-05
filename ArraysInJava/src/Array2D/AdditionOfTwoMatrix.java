package Array2D;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	void additionOfTwoMatrix(int arr[][]) {
		System.out.println();
		System.out.println("Addition of Two Matrix is: ");
		int arrC[][] = new int[3][3];
		int arrB[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				arrC[i][j] = arr[i][j] + arrB[i][j];
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(arrC[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 3, col = 3;
		int arr[][] = new int[row][col];

		System.out.println("Enter The Array Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix is: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		AdditionOfTwoMatrix am = new AdditionOfTwoMatrix();
		am.additionOfTwoMatrix(arr);

		sc.close();

	}

}
