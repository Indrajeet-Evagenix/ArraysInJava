package AssignmentsOnArray;

// WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]

import java.util.Arrays;

public class SecondLargestNumber {

	void max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Elements of an Array is: " + Arrays.toString(arr));
		System.out.println("Largest Number: " + (max - 1));
	}

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 16, 13, 14, 15, 17 };

		SecondLargestNumber fm = new SecondLargestNumber();
		fm.max(arr);

	}

}
