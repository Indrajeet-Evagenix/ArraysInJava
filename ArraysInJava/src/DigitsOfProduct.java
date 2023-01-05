import java.util.Arrays;
import java.util.Scanner;

public class DigitsOfProduct {
	
	void productOfDigits(int arr[]){
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product=product* arr[i];
		}
		System.out.println("Elements of the array are: "+Arrays.toString(arr));
		System.out.println("Sum of the elements of the array : "+product);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of an Arrray: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter The Array Elements: ");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		DigitsOfProduct dp=new DigitsOfProduct();
		dp.productOfDigits(arr);
		
		sc.close();

	}

}
