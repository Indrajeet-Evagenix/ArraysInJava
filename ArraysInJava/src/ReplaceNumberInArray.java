
public class ReplaceNumberInArray {

	void replace(int arr[]) {
		int sum = 0;
		System.out.print("After Replace Array is: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = sum;
			}
			System.out.print(arr[i] + " ");
		}
	}

	void marks(int mark[]) {
		int sum = 0, i = 0;
		for (i = 0; i < mark.length; i++) {
			sum = sum + mark[i];
		}
		System.out.println("The Total Marks is: " + sum);
		System.out.println("The Average of Marks is: " + (sum / mark.length));
	}

	public static void main(String[] args) {
		ReplaceNumberInArray rn = new ReplaceNumberInArray();

		int arr[] = { 2, -1, 56, -2, 67, -9, 90, -5 };
		System.out.print("Before Character Replace Array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		rn.replace(arr);

		System.out.println("\n");

		int marks[] = { 65, 85, 80, 92, 67, 90, };
		System.out.print("Marks of The Student is: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();

		rn.marks(marks);

	}

}
