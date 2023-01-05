package AssignmentsOnArray;

// Write a Java program to test the equality of two arrays. Means e.g 
// arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
// Here both arrays are equal

public class CheckArrayEquality1 {

	void checkEqual(int arr1[], int arr2[]) {

		boolean equal = true;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equal = false;
				}
			}
		} else {
			equal = false;
		}
		if (equal) {
			System.out.println("Array 1 is Equal to Array 2");
		} else {
			System.out.println("Array 1 is Not Equal to Array 2");
		}

	}

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 10, 20, 30, 40, 50 };
		int arr3[] = { 10, 20, 30, 40, 60 };

		CheckArrayEquality1 ce = new CheckArrayEquality1();
		ce.checkEqual(arr1, arr2);
		System.out.println();
		ce.checkEqual(arr1, arr3);

	}

}
