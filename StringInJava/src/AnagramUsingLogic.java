import java.util.Arrays;

public class AnagramUsingLogic {

	public static void main(String[] args) {
		String s1 = "Worlds";
		String s2 = "slrdoW";

		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();

			// Sorting Array ch1
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch1.length - 1; j++) {
					if (ch1[j] > ch1[j + 1]) {
						char temp = ch1[j];
						ch1[j] = ch1[j + 1];
						ch1[j + 1] = temp;
					}
				}
			}
			System.out.println("Sorted Array 1: " + Arrays.toString(ch1));

			// Sorting Array ch2
			for (int i = 0; i < ch2.length; i++) {
				for (int j = 0; j < ch2.length - 1; j++) {
					if (ch2[j] > ch2[j + 1]) {
						char temp = ch2[j];
						ch2[j] = ch2[j + 1];
						ch2[j + 1] = temp;
					}
				}
			}
			System.out.println("Sorted Array 1: " + Arrays.toString(ch2));

			int flag = 1;
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}

		} else {
			System.out.println("Not Anagram");
		}

	}

}
