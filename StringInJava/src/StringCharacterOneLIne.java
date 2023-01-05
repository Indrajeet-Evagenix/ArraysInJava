
public class StringCharacterOneLIne {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "Hello";
		String s3 = "how";

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		char ch3[] = s3.toCharArray();

		for (int i = 0; i < ch1.length; i++) {

			System.out.println(ch1[i] + "" + ch2[i] + "" + ch3[i]);
			if (ch2.length != ch3.length) {
				System.out.println(ch2[i] + "" + ch3[i]);
			}

		}

	}

}
