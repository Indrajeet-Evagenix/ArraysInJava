
public class CheckOneWordAndPrintString {

	public static void main(String[] args) {
		String str[] = { "Raj", "Aadya", "Veer", "Rahul", "Anjali", "Ajay", "Raju" };

		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == 'j') {
					String s = new String(ch);
					System.out.println(s);
					break;
				}
			}
		}
	}

}
