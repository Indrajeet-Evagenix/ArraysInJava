package AssignmentsOnArray;

// WAP to check if an array of integers contains two specified elements 65 and 77.

public class CheckNumberPresent {

	void checkNumber(int arr[], int num1, int num2) {
		boolean check = false;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == num1 || arr[i] == num2) {
				check = true;
			}

		}
		if (check) {
			System.out.println("Elements are Present in an Array");
		} else {
			System.out.println("Elements are Not Present in an Array");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 77, 77, 65, 65, 65, 77 };
		int num1 = 65, num2 = 77;

		CheckNumberPresent cn = new CheckNumberPresent();
		cn.checkNumber(arr, num1, num2);

	}

}
