package AssignmentsOnArray;

// WAP to find max character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, 
// ‘R’, ‘Z’, ‘p’], so max character is ‘x’. 

import java.util.Arrays;

public class MaximumCharacter {

	void maximum(char arr[]) {
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

		System.out.println("Maximum Character is: " + arr[arr.length - 1]);
		System.out.println("Minimum Character is: " + arr[0]);
	}

	public static void main(String[] args) {
		char arr[] = { 'A', 'D', 'E', 'x', 'Z', 'R', 'p' };

		MaximumCharacter mc = new MaximumCharacter();
		mc.maximum(arr);

	}
}
