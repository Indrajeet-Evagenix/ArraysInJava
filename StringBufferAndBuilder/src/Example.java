import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// String Buffer is Same as String Builder

		// String Buffer is Synchronized
		// String Builder is not Synchronized

		String s = "Java Language";
//		StringBuffer sbf=new StringBuffer();// Its same as constructor
//		System.out.println(sbf.capacity());// Default capacity String Buffer

		// When we add String in String Buffer then its increases capacity
		StringBuffer sbf1 = new StringBuffer("Java Language");
//		System.out.println(sbf1.capacity());
//		System.out.println(sbf1);

		// in String Buffer we can Add String Directly by append function
//		sbf1.append(" Language");
//		System.out.println(sbf1);

		// take input from user and to String
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String name");
//		String s1=sc.nextLine();
//		sbf1.append(s1);
//		System.out.println(sbf1);

		// in String Buffer we can not add String Directly by concat function
//		s.concat(" Core");
//		System.out.println(s);

		// for Reverse String
//		sbf1.reverse();
//		System.out.println(sbf1);

		// By using this we can delete character at setting particular index
//		sbf1.deleteCharAt(2);
//		System.out.println(sbf1);

		// By using this we can delete character at particular index
//		sbf1.delete(5, 9);
//		System.out.println(sbf1);

		// in this we can set or change the character at particular index
//		sbf1.setCharAt(2, 'H');
//		System.out.println(sbf1);

		// By using this we can insert String or Character at particular index
//		sbf1.insert(1, "DD");
//		System.out.println(sbf1);

	}

}
