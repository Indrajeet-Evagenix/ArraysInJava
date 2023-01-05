package AssignmentsOnArray;

//Write a Java program to test the equality of two arrays. Means e.g 
//arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
//Here both arrays are equal

public class CheckEqualityOfArray {

	void checkEquality(int arr1[], int arr2[]) {
		int flag = 0;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = 1;

				}

			}

		} else {
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Both The Array is Equal");
		} else {
			System.out.println("Both The Array is Not Equal");
		}

	}

	public static void main(String[] args) {
		int arr1[] = { 52, 22, 62, 12, 42, 22, 21 };
		int arr2[] = { 52, 22, 62, 12, 42, 22, 21 };

		CheckEqualityOfArray ce = new CheckEqualityOfArray();
		ce.checkEquality(arr1, arr2);

	}

}
