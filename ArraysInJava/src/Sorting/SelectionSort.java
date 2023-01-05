package Sorting;

import java.util.Arrays;

public class SelectionSort {

	void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 10, 50, 30, 20, 40, 60, 8, 9 };

		SelectionSort bs = new SelectionSort();
		bs.sort(arr);

	}

}
