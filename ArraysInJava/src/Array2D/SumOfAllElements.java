package Array2D;

import java.util.Scanner;

public class SumOfAllElements {

	void sumOfAllElements(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + arr[i][j];
			}
		}
		System.out.print("Addition of All Elements is: " + sum);
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
		SumOfAllElements sa = new SumOfAllElements();
		sa.sumOfAllElements(arr);

		sc.close();

	}

}
