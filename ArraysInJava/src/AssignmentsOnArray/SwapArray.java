package AssignmentsOnArray;

// WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4] 

import java.util.Arrays;

public class SwapArray {

	void swap(int arr[]) {
		int temp;
		int mid = arr.length / 2;
		for (int i = 0; i < mid; i++) {
			temp = arr[i];
			arr[i] = arr[i + mid];
			arr[i + mid] = temp;
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6};
		int arr[] = { 2, 4, 9, 0 };

		SwapArray sw = new SwapArray();
		sw.swap(arr);

	}

}
