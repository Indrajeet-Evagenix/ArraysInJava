
// 9.	WAP to split string into 2 tokens where string is “HELLO$WORLD”

public class Q9SplitString {

	public static void main(String[] args) {
		String s = "HELLO$WORLD";

		String s1[] = s.split("$");

		for (String s2 : s1) {
			System.out.println(s2);
		}

	}

}
