import java.util.Arrays;

public class FindMaxValue {

	void max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Elements of an Array is: " + Arrays.toString(arr));
		System.out.println("Largest Number: " + max);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 16, 13, 14, 15 };

		FindMaxValue fm = new FindMaxValue();
		fm.max(arr);

	}

}
