package AssignmentsOnArray;

public class WholeMissingNumber {

	void missingNumber1(int arr[]) {
		System.out.print("Missing Number is: ");
		int cnt = 0;
		int len = arr.length - 1;
		for (int i = arr[0]; i < arr[len - 1]; i++) {
			if (arr[cnt] == i) {
				cnt++;
			} else {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 9, 10 };

		WholeMissingNumber wmn = new WholeMissingNumber();
		wmn.missingNumber1(arr);

	}

}
