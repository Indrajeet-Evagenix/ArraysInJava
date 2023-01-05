package Sorting;

import java.util.Arrays;

public class SortDescendingOrder {

	void sort(int arr[]) {

		System.out.println("Before Sorted Array: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length - 1; j++) 
			{
				if (arr[j] < arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sorted Array: " + Arrays.toString(arr));

		System.out.println("Smallest Number: " + arr[arr.length - 1]);
		System.out.println("Second Smallest Number: " + arr[arr.length - 2]);

		System.out.println("Largest Number: " + arr[0]);
		System.out.println("Second Largest Number: " + arr[1]);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 50, 30, 20, 40, 60, 8, 9 };

		SortDescendingOrder ds = new SortDescendingOrder();
		ds.sort(arr);

	}

}
