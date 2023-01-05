package AssignmentsOnArray;

//WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
//soutput must be 78, 37, 29, 45, 90, 3 

import java.util.Arrays;

public class ReverseNumber {

	void reverse(int arr[]) {
		System.out.println("Old Array in Order: " + Arrays.toString(arr));
		System.out.print("Array in Reverse Order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\n----------Another Way to do--------\n");
	}

	// Another Method

	void reverse1(int arr[]) {
		System.out.println("Old Array in Order: " + Arrays.toString(arr));
		System.out.print("Array in Reverse Order: ");
		int temp;
		int mid =arr.length/2;
		for (int i = 0; i < mid; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		ReverseNumber rn = new ReverseNumber();
		rn.reverse(arr);
		rn.reverse1(arr);

	}

}
