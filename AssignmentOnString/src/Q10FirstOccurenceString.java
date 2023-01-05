import java.util.Arrays;

// 10.	Write a Java program to find first occurrence of a character in a given string.

public class Q10FirstOccurenceString {

	public static void main(String[] args) {
		String s2 = "Language";
		s2 = s2.toLowerCase();
		boolean flag = false;
		int cnt = 0, i;

		for (i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == 'l') {
				flag = true;
				cnt++;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Character 'L' is founded in String at position " + i);
		} else {
			System.out.println("Character 'L' is not founded in String");
		}

	}

}
