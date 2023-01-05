import java.util.Scanner;

public class PrimeNumberInArray {

	void prime(int arr[]) {
		System.out.print("prime numbers in the array: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			int mid = arr[i] / 2;
			int j;
			for (j = 2; j <= mid; j++) {

				if (arr[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)

				System.out.print(arr[i] + " ");

//			if(j>mid) { // Another way to do
//				System.out.print(arr[i]+" ");
//			}
		}

	}

	void reverse(int arr[]) {
		System.out.println("Array in Reverse Order: ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter The Array Elements: ");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		PrimeNumberInArray pr = new PrimeNumberInArray();
		pr.prime(arr);
		pr.reverse(arr);
	}

}
