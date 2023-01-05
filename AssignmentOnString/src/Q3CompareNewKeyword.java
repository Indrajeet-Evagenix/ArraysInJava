
// 3.	Compare string using new operator when new is present see different reference is there

public class Q3CompareNewKeyword {

	public static void main(String[] args) {
		String s1 = "Java";
		String s5 = new String("Java");

		System.out.println(s1 == s5);

	}

}
