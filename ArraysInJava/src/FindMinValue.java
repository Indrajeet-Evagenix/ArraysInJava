
public class FindMinValue {

	void min(int arr[]) {
		int max = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		System.out.println("Smallest Number: " + max);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 16, 13, 14, 15 };

		FindMinValue fm = new FindMinValue();
		fm.min(arr);

	}

}
