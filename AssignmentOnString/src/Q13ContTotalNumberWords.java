import java.util.Arrays;

// 13.	Write a Java program to count total number of words in a string.

public class Q13ContTotalNumberWords {

	void countWords(String str) {
		String newString[] = str.split(" ");
		int cnt = 0;
		for (int i = 0; i < newString.length; i++) {
			if (newString[i] == newString[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);

//		System.out.println(Arrays.toString(newString));
	}

	public static void main(String[] args) {
		String str = "java is a programming langauge";

		Q13ContTotalNumberWords ct = new Q13ContTotalNumberWords();
		ct.countWords(str);

	}

}
