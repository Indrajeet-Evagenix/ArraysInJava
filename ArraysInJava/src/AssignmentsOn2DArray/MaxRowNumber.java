package AssignmentsOn2DArray;

// WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
// output is: 31 and 25. 

public class MaxRowNumber {

	void maxRow(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int max = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		MaxRowNumber mr = new MaxRowNumber();
		mr.maxRow(arr);

	}

}
