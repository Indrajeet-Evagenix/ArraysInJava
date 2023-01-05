import java.util.Arrays;

public class UpperCase {

	public static void main(String[] args) {
		String s1 = "Java Language";
		char ch = 'a';
		int cnt = 0;

		char ch1[] = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			if (ch1[i] == ch) {
				ch1[i] = 'A';// Converting 'a' to 'A' in all String
			}
//			System.out.print(ch1[i]);
		}
//		System.out.println();
		System.out.println(ch1);

//		System.out.println(s1.toLowerCase());
		
//		System.out.println(Arrays.toString(ch1));

	}

}
