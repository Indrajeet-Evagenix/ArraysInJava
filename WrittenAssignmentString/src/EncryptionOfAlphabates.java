
public class EncryptionOfAlphabates {

	public static void main(String[] args) {
		String s = "KITE";
		int sum = 0;

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int j = ch[i] - 64;
			sum = sum + j;
			System.out.println(ch[i] + " " + j);
		}
		System.out.println("Sum of Numeric Value is: " + sum);

		System.out.println();
		String s1 = "THE IS THE LIMIT";

		String s2[] = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			int sum1=0;
			char ch1[] = s2[i].toCharArray();
			for (int j = 0; j < ch1.length; j++) {
				sum1 = sum1 + (ch1[j] - 64);
			}
			System.out.println(s2[i] + " " + sum1);
		}

	}

}
