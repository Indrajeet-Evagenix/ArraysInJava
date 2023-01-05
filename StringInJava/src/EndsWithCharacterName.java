
public class EndsWithCharacterName {

	public static void main(String[] args) {
		String str[] = { "Raj", "Aadya", "Veer", "Rahul", "Anjali", "Ajay", "Raju" };

//		 Using Predefined Methods
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].endsWith("r")) {
//				System.out.println(str[i]);
//			}
//		}

		// Using Logic
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			if (ch[ch.length - 1] == 'r') {
				String s = new String(ch);
				System.out.println(s);
			}
		}
	}
}
