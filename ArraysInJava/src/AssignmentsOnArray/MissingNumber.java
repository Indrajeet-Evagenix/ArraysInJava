package AssignmentsOnArray;

// Write a Java program to find a missing number in an array. Means e.g. array has 1 
// to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5

public class MissingNumber {

	void missingNumber(int arr[]) {
		System.out.print("Missing number is: ");
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != j) {
				System.out.print(j + " ");
				j++;
			}
			j++;
		}
	}

	// Another Methods
	void missingNumber1(int arr[]) {
		System.out.println();
		System.out.print("Missing number is: ");
		int j = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != j) {
				System.out.print(j + " ");
				i--;
			}
			j++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 9, 10 };
		int arr1[] = { 1, 2, 3, 5, 6, 9, 10 };

		MissingNumber mn = new MissingNumber();
		mn.missingNumber(arr);
		mn.missingNumber1(arr1);

	}

}
