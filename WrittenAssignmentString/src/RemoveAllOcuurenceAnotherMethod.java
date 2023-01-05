import java.util.Arrays;

public class RemoveAllOcuurenceAnotherMethod {

	public static void main(String[] args) {
		String st = "Java Language. Core Java Session. Advance Java Session";

		String str[] = st.split(" ");
		System.out.println(Arrays.toString(str));

		String s1 = "";

		// Another Methods
		String str1[] = new String[str.length];
		int j = 0;
		for (int i = 0; i < str.length; i++) {
			if (!str[i].equalsIgnoreCase("java")) {
				str1[j] = str[i];
				j++;
//					continue;
			}
		}
		// Output in the form of null value
		System.out.println(Arrays.toString(str1));

		// for removing null value
		for (String stt : str1) {
			if (stt != null) {
				System.out.println(stt);
			}
		}

	}

}
