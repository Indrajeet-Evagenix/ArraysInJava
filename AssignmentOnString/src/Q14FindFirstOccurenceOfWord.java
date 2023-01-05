import java.util.Arrays;

// 14.	Write a Java program to find first occurrence of a word in a given string.

public class Q14FindFirstOccurenceOfWord {

	void firstWord(String str) {
		String newString[] = str.split(" ");

		for (int i = 0; i < newString.length; i++) {
			if (newString[i] == "Java") {
				System.out.println(newString[i]);
			}
		}

	}

	public static void main(String[] args) {
		String str = "Java is java progrmming language. java session";

		Q14FindFirstOccurenceOfWord ff = new Q14FindFirstOccurenceOfWord();
		ff.firstWord(str);

	}

}
