import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		String s1 = "Java Language";
		char ch = 'a';
		int cnt = 0;

		char ch1[] = s1.toCharArray();// Converting String to Character Array

		// Using Predefined methods

//		for (int i = 0; i < s1.length(); i++) {
//			if (s1.charAt(i) == ch) {
//				cnt++;
//			}
//		}
//		System.out.println(ch + " " + cnt);

		// Using Array
		for (int i = 0; i < s1.length(); i++) {
			if (ch1[i] == ch) {
				cnt++;
			}
		}
		System.out.println(ch + " " + cnt);
		System.out.println(ch1); // Print Same Array
		System.out.println(Arrays.toString(ch1));// Printing as an Array

		// Convert Array to String
		String s2 = new String(ch1);
		System.out.println(s2);

	}

}
