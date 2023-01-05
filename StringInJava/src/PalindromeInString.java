import java.util.Arrays;

public class PalindromeInString {

	public static void main(String[] args) {
		String str[] = { "aabaa", "aba" };
		boolean flag = true;
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] != ch[ch.length - 1 - j]) {
					flag = false;
					break;
				}
			}

		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
