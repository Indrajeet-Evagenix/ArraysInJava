
public class SearchElements {

	void arrayLength(int ar[]) {
		System.out.println("Lenth of Array is: " + ar.length);
	}

	void arrayElements(int ar[]) {
		System.out.print("Elements Present in an Array is: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	void alternateNumber(int ar[]) {
		System.out.print("Alternate Number in an array is: ");
		for (int i = 0; i <= ar.length - 1; i++) {

			System.out.print(ar[i] + " ");
			i++;
		}
		System.out.println();
	}

	void alternateNumber1(int ar[]) {
		System.out.print("Alternate Number in an array is: ");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
			i++;
		}
		System.out.println();
	}

	void searchElements(int ar[], int element) {
		int cnt = 0;
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] == element) {
				System.out.println("Element '" + element + "' is Present at Index: " + i);
			} else {
				cnt++;
			}
		}
		if (cnt == ar.length) {
			System.out.println("Element '" + element + "' is not Present");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 90, 80, 70, 70, 70 };

		SearchElements se = new SearchElements();

		se.arrayLength(arr);
		se.arrayElements(arr);
		se.searchElements(arr, 70);
		se.alternateNumber(arr);

	}

}
