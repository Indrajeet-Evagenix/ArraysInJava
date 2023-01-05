
public class FindDigitsAlphabatesNumber {

	public static void main(String[] args) {
		String s = "Indra,/jeet2Kishanlal@Gupta";
		int alphabate = 0, digit = 0, special = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				alphabate++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				special++;
			}
		}
		System.out.println("Total Number of Alphabate is: " + alphabate);
		System.out.println("Total Number of Digits is: " + digit);
		System.out.println("Total Number of Special Character is: " + special);

	}

}
