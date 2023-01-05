import java.util.Arrays;

public class AnagramNumberUsingFunction {

	public static void main(String[] args) {
		String s1 = "Worlds";
		String s2 = "slrdoW";

		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();

			// Predefined Methods
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			// Predefined Methods
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
			
		} else {
			System.out.println("Not Anagram");
		}

	}

}
