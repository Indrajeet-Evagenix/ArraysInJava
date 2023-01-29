
public class FindMinValue {

	void minimumNumber(int arr[]) {
		int min = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Number: " + min);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 16, 13, 14, 15 };

		FindMinValue fm = new FindMinValue();
		fm.minimumNumber(arr);

	}

}
