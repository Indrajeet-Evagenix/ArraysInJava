package AssignmentsOn2DArray;

// WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, 
// {34, 42, 2}} output is: 34, 42, and 16.

public class MaxColumnNumber {
	
	void maxColumn(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int max = arr[0][i];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 5, 16 }, { 34, 42, 2 } };

		MaxColumnNumber mc = new MaxColumnNumber();
		mc.maxColumn(arr);

	}

}
