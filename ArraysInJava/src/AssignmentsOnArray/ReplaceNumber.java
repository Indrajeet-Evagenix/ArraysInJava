package AssignmentsOnArray;

import java.util.Arrays;

// WAP to replace all the 0’s with 1’s in your array. 
// Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34] 

public class ReplaceNumber {

	void replace(int arr[]) {
		System.out.println("Old Array is: " + Arrays.toString(arr));
//		System.out.print("New Array is: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			}
//			System.out.print(arr[i]+" ");
		}
		System.out.println("New Array is: " + Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };

		ReplaceNumber rn = new ReplaceNumber();
		rn.replace(arr);

	}

}
