package Array2D;

public class ProductOfMatrix {

	void productOfTwoMatrix(int arr[][]) {
		System.out.println();
		System.out.println("Multiplication of Two Matrix is: ");
		int arrC[][] = new int[3][3];
		int arrB[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				arrC[i][j] = arr[i][j] * arrB[i][j];
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
		int arrA[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };

		ProductOfMatrix pm = new ProductOfMatrix();
		pm.productOfTwoMatrix(arrA);

	}

}
