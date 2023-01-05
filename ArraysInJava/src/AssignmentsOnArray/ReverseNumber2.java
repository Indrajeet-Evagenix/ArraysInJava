package AssignmentsOnArray;

// WAP to reverse the array itself, don’t print array in reverse – I want current array 
// reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
// 37, 29, 45, 90, 3] by using temporary array. 

import java.util.Arrays;

public class ReverseNumber2 {

	void reverse1(int arr[]) {
		System.out.println("Old Array in Order: " + Arrays.toString(arr));
		System.out.print("Array in Reverse Order: ");
		int temp;
		int mid = arr.length / 2;
		for (int i = 0; i < mid; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		ReverseNumber2 rn = new ReverseNumber2();
		rn.reverse1(arr);

	}

}
