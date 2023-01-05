package AssignmentsOnArray;

import java.util.Scanner;

public class DuplicateCountFromUserInput {

	void checkDuplicate(int arr[], int num) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
//				System.out.println("Duplicate Number in an Array is: " + arr[i] + " At Index: " + i);
				cnt++;

			}
		}
		System.out.println("In an Array '" + num + "' is Present at " + cnt + " Times");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = { 10, 20, 30, 10, 40, 50, 10, 80,40, 70, 10 };

		System.out.println("Enter Number");
		int num = sc.nextInt();

		DuplicateCountFromUserInput dc = new DuplicateCountFromUserInput();
		dc.checkDuplicate(arr1, num);

		sc.close();
	}

}
