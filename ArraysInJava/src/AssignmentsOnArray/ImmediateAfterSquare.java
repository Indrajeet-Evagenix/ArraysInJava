package AssignmentsOnArray;

//WAP to replace all negative value with its immediate After elements square. Means 
//arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9, 8] 
//Output array will be [12, 3, 841, 29, 5, 1936, 44, 7, 64, 8].

import java.util.Arrays;

public class ImmediateAfterSquare {
	
	void replace(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i + 1] * arr[i + 1];
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9, 8 };

		ImmediateAfterSquare ia = new ImmediateAfterSquare();
		ia.replace(arr);

	}

}
