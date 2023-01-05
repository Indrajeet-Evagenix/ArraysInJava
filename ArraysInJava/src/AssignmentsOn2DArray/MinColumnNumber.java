package AssignmentsOn2DArray;

// WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, 
// {34, 42, 2}} output is: 12, 5, 2.

public class MinColumnNumber {

	void minColumn(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int min = arr[0][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] < min) {
					min = arr[j][i];
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 5, 16 }, { 34, 42, 2 } };

		MinColumnNumber mc = new MinColumnNumber();
		mc.minColumn(arr);

	}

}
