import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 10, 20, 30, 40, 50, 60 };
		try {
			System.out.println("Enter Number");
			arr[10] = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

//		for (int a : arr) {
//			System.out.println(a);
//		}

	}

}
