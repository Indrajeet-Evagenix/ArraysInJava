
public class FindDuplicateWordFromString {

	public static void main(String[] args) {
		String s = "India is my country and India is best country";

		int count;
		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equalsIgnoreCase(s1[j])) {
					count++;
					s1[j] = "0";
				}
			}
			if (count > 1 && s1[i] != "0") {
				System.out.println(s1[i]);
			}
		}

	}

}
