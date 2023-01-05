package Sorting;

import java.util.Arrays;

public class CharacterSort {

	void sort(char arr[]) {
		System.out.println("Before Sorted Character: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sorted Character: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		char arr[] = { 'd', 'a', 'z', 'w', 'x', 'b', 'g', 'e' };

		CharacterSort cs = new CharacterSort();
		cs.sort(arr);

	}

}
