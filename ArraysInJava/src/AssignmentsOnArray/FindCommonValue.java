package AssignmentsOnArray;

// Write a Java program to find the common elements between two arrays (int values) 
// Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 66, 22], 
// so common between two arrays are 23 and 91

import java.util.Arrays;

public class FindCommonValue {

	void commonValue(int arr1[], int arr2[]) {
		System.out.println("Elements of an Array One is: " + Arrays.toString(arr1));
		System.out.println("Elements of an Array Second is: " + Arrays.toString(arr2));
		System.out.print("Common Elements: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr1[] = { 12, 23, 24, 67, 78, 91, 56 };
		int arr2[] = { 39, 25, 15, 23, 55, 91, 66, 22 };

		FindCommonValue fc = new FindCommonValue();
		fc.commonValue(arr1, arr2);

	}

}
