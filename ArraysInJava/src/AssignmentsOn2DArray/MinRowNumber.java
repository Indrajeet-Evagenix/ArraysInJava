package AssignmentsOn2DArray;

// WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
// output is: 9 and 12. 

public class MinRowNumber {

	void minRow(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int min = arr[0][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		MinRowNumber mr = new MinRowNumber();
		mr.minRow(arr);

	}

}
