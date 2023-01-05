package AssignmentOnBothTheArray;

import java.util.Arrays;

// WAP to replace all negative value with its immediate left elements square. Means 
// arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
// Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].

public class ImmediateLeftSquare {

	void replace(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i - 1] * arr[i - 1];
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };

		ImmediateLeftSquare il = new ImmediateLeftSquare();
		il.replace(arr);

	}

}
