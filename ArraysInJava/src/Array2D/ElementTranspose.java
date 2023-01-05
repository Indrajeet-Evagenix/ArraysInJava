package Array2D;

public class ElementTranspose {

	void elemTranspose(int arr[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i != j && i < j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		ElementTranspose et = new ElementTranspose();
		et.elemTranspose(arr);

	}

}
