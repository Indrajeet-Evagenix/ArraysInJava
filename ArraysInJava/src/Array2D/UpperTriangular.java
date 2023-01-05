package Array2D;

import java.util.Scanner;

public class UpperTriangular {

	void upperTriangular(int arr[][]) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i < j) {
					System.out.print(arr[i][j] + "\t");
				}
			}

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
		UpperTriangular ut = new UpperTriangular();
		ut.upperTriangular(arr);

		sc.close();

	}

}
