import java.util.Arrays;

public class SortingArrayString {

	public static void main(String[] args) {
		String str[] = { "Raj", "Aadya", "Veer", "Rahul", "Anjali", "Ajay", "Raju" };

//		 Using Predefined Methods
		
//		Arrays.sort(str);
//		System.out.println(Arrays.toString(str));

		// Using Logic
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));

	}

}
