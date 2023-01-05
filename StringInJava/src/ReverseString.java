import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "Java is a programming language";
		String str[] = s1.split(" ");

		System.out.println(Arrays.toString(str));

		for (int j = 0; j < str.length; j++) {
			char ch[] = str[j].toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}

	}

}
