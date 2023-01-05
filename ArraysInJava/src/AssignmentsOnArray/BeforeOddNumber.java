package AssignmentsOnArray;

import java.util.Arrays;

// WAP to arrange the elements of an given array of integers where all Even integers 
// appear before all the Odd integers. 

public class BeforeOddNumber {

	void oddNumber(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] % 2 != 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 6, 3, 7, 2, 8 };

		BeforeOddNumber bo = new BeforeOddNumber();
		bo.oddNumber(arr);

	}

}
