package AssignmentsOnArray;

// WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]
		
import java.util.Arrays;

public class SecondSmallestNumber {

	void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) 
		{
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}
		System.out.println("Elements of an Array is: " + Arrays.toString(arr));
		System.out.println("Largest Number: " + (min+1));
	}

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12,16, 13, 14, 15 };
		
		SecondSmallestNumber fm=new SecondSmallestNumber();
		fm.min(arr);

	}

}
