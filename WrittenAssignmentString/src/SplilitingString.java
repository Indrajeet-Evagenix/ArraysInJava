
public class SplilitingString {

	public static void main(String[] args) {
		String s1 = "HELLO@WORLD";
		String s2[] = s1.split("@");

		for (String s3 : s2) {
			System.out.println(s3);
		}

	}

}
