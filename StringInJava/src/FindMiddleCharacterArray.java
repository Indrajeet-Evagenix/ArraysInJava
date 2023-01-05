
public class FindMiddleCharacterArray {

	public static void main(String[] args) {
		String str[] = { "Raj", "Aadya", "Veer", "Rahul", "Anjali", "Ajay", "Raju" };

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("ja")) {
				System.out.println(str[i]);
			}
		}
	}
}
