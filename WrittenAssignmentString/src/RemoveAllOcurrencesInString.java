import java.util.Arrays;

public class RemoveAllOcurrencesInString {

	public static void main(String[] args) {
		String s = "Java Language. Core Java Session. Advance Java Session";

		String s1[] = s.split(" ");
		System.out.println(Arrays.toString(s1));

		String s2 = "";

		for (int i = 0; i < s1.length; i++) {
			if (!s1[i].equalsIgnoreCase("java")) {
				s2 = s2 + s1[i] + " ";
			}
		}
		System.out.println(s2);

	}

}
