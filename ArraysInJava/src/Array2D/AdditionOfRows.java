package Array2D;

public class AdditionOfRows {

	void additionRow(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
					sum = sum + arr[i][j];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 }, { 1, 2, 3 } };

		AdditionOfRows ar = new AdditionOfRows();
		ar.additionRow(arr);

	}

}
