package AssignmentsOnArray;

//  WAP to display all square number in array. Means e.g. 
// arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.

public class FindSquareRootOfNumber {

	void squareRoot(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (Math.sqrt(arr[i]) == Math.floor(Math.sqrt((arr[i])))) {
				System.out.print(arr[i] + " ");
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		FindSquareRootOfNumber fs = new FindSquareRootOfNumber();
		fs.squareRoot(arr);

	}

}
