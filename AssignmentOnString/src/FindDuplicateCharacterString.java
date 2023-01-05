
public class FindDuplicateCharacterString {

	static void duplicateCharacterCount(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int cnt = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					ch[j] = '\0';// \0 means null value
				}
			}
			if (cnt != 0 && ch[i] != '\0') {
				System.out.println(ch[i] + " " + cnt);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		duplicateCharacterCount(str);
	}

}
