
public class StartingWithCharacterName {

	public static void main(String[] args) {
		String str[] = { "Raj", "Aadya", "Veer", "Rahul", "Anjali", "Ajay", "Raju" };

		// Using Predefined Methods
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].startsWith("R")) {
//				System.out.println(str[i]);
//			}
//		}

		// Using Logic
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			if (ch[0] == 'R') {
				String s = new String(ch);
				System.out.println(s);
			}
		}

	}

}
