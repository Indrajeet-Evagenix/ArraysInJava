package AssignmentOnBothTheArray;

import java.util.Arrays;

// WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’],
// so min character is ‘A’.

public class MinimumCharacter {

	void minimum(char arr[]) {
		System.out.println("Original Array is: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println("New Array is: " + Arrays.toString(arr));

		System.out.println("Minimum Character is: " + arr[0]);
		System.out.println("Maximum Character is: " + arr[arr.length - 1]);

	}

	public static void main(String[] args) {
		char arr[] = { 'A', 'D', 'E', 'x', 'z', 'R' };

		MinimumCharacter mc = new MinimumCharacter();
		mc.minimum(arr);

	}

}
