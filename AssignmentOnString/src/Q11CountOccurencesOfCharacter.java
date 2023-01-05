import java.util.Arrays;

// 11.	Write a Java program to count occurrences of a character in given string.

public class Q11CountOccurencesOfCharacter {

	void countOccurence(String str) {
		str = str.toLowerCase();

		char ch[] = str.toCharArray();
//		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < ch.length - 1; i++) {
			int cnt = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					ch[j] = '\0';// \0 mean null value
				}
			}
			if (ch[i] != '\0') {
				System.out.println(ch[i] + "---->" + cnt);
			}
		}
		System.out.println();43
	}

	public static void main(String[] args) {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		Q11CountOccurencesOfCharacter co = new Q11CountOccurencesOfCharacter();
		co.countOccurence(str);

	}

}
