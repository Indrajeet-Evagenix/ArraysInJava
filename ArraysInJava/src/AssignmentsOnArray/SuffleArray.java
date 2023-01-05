package AssignmentsOnArray;

import java.util.Arrays;

//  WAP to shuffle array. Means e.g. arr[] = [5, 6, 23, 67, 39, 10, 2] 
// So output array is [6, 23, 67, 39, 10, 2, 5]. 

public class SuffleArray {

	void suffle(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < 6) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
//			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 23, 67, 39, 10, 2 };

		SuffleArray sa = new SuffleArray();
		sa.suffle(arr);

	}

}
