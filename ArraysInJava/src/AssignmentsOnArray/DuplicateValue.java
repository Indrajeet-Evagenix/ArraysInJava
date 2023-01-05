package AssignmentsOnArray;

// Write a Java program to find the duplicate values of an array of integer values. 
// Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.

import java.util.Arrays;

public class DuplicateValue {

	void duplicate(int arr[]) {
		System.out.println("Elements of an Array is: " + Arrays.toString(arr));
		System.out.print("Duplicate Elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 10, 90, 78, 56, 10, 78, 34, 64 };

		DuplicateValue dv = new DuplicateValue();
		dv.duplicate(arr);

	}

}
