
// 12.	Write a Java program to trim leading white space characters in a string.

public class Q12TrimLeadingWhiteSpace {

	void trimString(String str) {
		String newString = str.trim();

		System.out.println("Original String is: " + str);
		System.out.println("New String is: " + newString);

	}

	public static void main(String[] args) {
		String str = "   Hello Java Programming     ";

		Q12TrimLeadingWhiteSpace tl = new Q12TrimLeadingWhiteSpace();
		tl.trimString(str);

	}

}
