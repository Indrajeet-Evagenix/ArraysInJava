package AssignmentOnBothTheArray;

import java.util.Scanner;

public class LowerTriangular {

	void lowerTriangular(int arr[][]) {
		int sum = 0;
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i > j) {
					System.out.print(arr[i][j] + "\t");
					sum = sum + arr[i][j];
				}

			}

		}
		System.out.println();
		System.out.println("Sum of Lower Triangular Matrix: " + sum);
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
		LowerTriangular lt = new LowerTriangular();
		lt.lowerTriangular(arr);

		sc.close();

	}

}
