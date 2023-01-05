
public class RemoveCharInString {

	public static void main(String[] args) {
		String s = "abbcadfbcbcan";

		// By Using Function
//		System.out.println(s.replace("bca", ""));

		char ch[] = s.toCharArray();
		String s1 = "";
		int len = ch.length;

		for (int i = 0; i < len; i++) {
			if (i == len - 1 || i == len - 2) {
				s1 = s1 + ch[i];
			} else {
				if (ch[i] == 'b' && ch[i + 1] == 'c' && ch[i + 2] == 'a') {
					i = i + 2;
				} else {
					s1 = s1 + ch[i];
				}
			}

		}
		System.out.println(s1);

	}

}
