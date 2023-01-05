import java.util.Arrays;
import java.util.Scanner;

public class SearchElementTakeInputFromUser {

	void searchElement(int ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element to Search From an Array Element");
		int searchElement = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i <= ar.length-1; i++) {
			if (ar[i] == searchElement) {
				System.out.println("Array Element '" + searchElement + "' Present at Index: " + i);
			}else
			cnt++;
		}
		if (cnt == ar.length) {
			System.out.println("The Element '" + searchElement + "' is Not Present an Array");
		}

	}

	void printElement(int ar[]) {
		System.out.print("Array Elements are: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
//		System.out.println(Arrays.toString(ar)+" ");
	}

	void evenNumber(int ar[]) {
		System.out.print("Even Array Elements are: ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
		System.out.println();
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

		SearchElementTakeInputFromUser se = new SearchElementTakeInputFromUser();

		se.printElement(arr);
		se.evenNumber(arr);
		se.searchElement(arr);

		sc.close();
	}

}
