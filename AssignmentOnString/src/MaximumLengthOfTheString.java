
public class MaximumLengthOfTheString {

	public static void main(String[] args) {
		String str = "india is beautiful country";

		String str1[] = str.split("\\s"); // \\s means converting to array form to The String

		int max = str1[0].length();

		for (int i = 0; i < str1.length; i++) {
			if (str1[i].length() > max) {
				max = str1[i].length();
				System.out.println(str1[i] + "---->" + max);
			}
		}

	}

}
