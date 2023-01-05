
public class MinimumLengthOfTheString {

	public static void main(String[] args) {
		String str = "india is beautiful country";

		String str1[] = str.split("\\s"); // \\s means converting to array form to The String

		int min = str1[0].length();

		for (int i = 0; i < str1.length; i++) {
			if (str1[i].length() < min) {
				min = str1[i].length();
				System.out.println(str1[i] + "---->" + min);
			}
		}

	}

}
