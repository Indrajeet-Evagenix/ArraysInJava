package AssignmentOnBothTheArray;

import java.util.Scanner;

public class TransposeOfMatrix2D {

	void transposeOfMatrix(int arr[][]) {
		System.out.println();
		int arr1[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				arr1[j][i] = arr[i][j];
//				arr1[i][j] = arr[j][i]; // Another Logic
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(arr1[i][j] + "\t");

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
		TransposeOfMatrix2D tm = new TransposeOfMatrix2D();
		tm.transposeOfMatrix(arr);

		sc.close();

	}

}
