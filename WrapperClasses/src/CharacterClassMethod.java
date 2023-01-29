
public class CharacterClassMethod {

	public static void main(String[] args) {

		char ch1 = '8';
		System.out.println(Character.getNumericValue(ch1));

		char ch = 'a';

		System.out.println("Digit is: " + Character.isDigit(ch));
		System.out.println("Character: " + Character.isLetter(ch));
		System.out.println("Lower: " + Character.isLowerCase(ch));
		System.out.println("Upper: " + Character.isUpperCase(ch));
		System.out.println("WhiteSpace: " + Character.isWhitespace(ch));
		System.out.println("Identifier: " + Character.isJavaIdentifierPart(ch));
		System.out.println(Character.isJavaLetterOrDigit(ch));
		System.out.println(Character.MAX_VALUE);// Max Value Not Printable
		System.out.println(Character.MIN_VALUE);// Min Value Not Printable

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.max(10, 25));
		System.out.println(Integer.min(20, 25));
		System.out.println(Integer.compare(100, 50));

		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toHexString(6));
		System.out.println(Integer.toOctalString(7));

		System.out.println(Integer.sum(10, 5));

		// Same as Float Value Also
		System.out.println(Float.MAX_VALUE);

	}

}
