import java.util.Arrays;
import java.util.Scanner;

class AnagramNew1 {

	public static boolean checkAnagram(String first, String second) {
		boolean isAnagram = true;

		char ch1[] = first.toLowerCase().toCharArray();
		char ch2[] = second.toLowerCase().toCharArray();

		if (ch1.length != ch2.length) {
			isAnagram = false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				isAnagram = false;
			}
		}

		return isAnagram;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();

		System.out.println(checkAnagram(first, second));

	}

}
