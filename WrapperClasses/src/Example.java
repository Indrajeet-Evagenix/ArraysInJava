
public class Example {

	public static void main(String[] args) {
		
		int i = 10; // Boxing/Wrapper Classes

		Integer it = new Integer(i); // 1.4 JDK Version

		Integer it1 = i; // autoboxing

		Integer it2 = new Integer(i);

		System.out.println(it1 == it2); // Check Memory Location
		System.out.println(it1.equals(it2)); // Check Contains

		Integer a = new Integer(1000);

		int t = a.intValue(); // unboxing 1.4 Version

		int g = a; // autoUnboxing

		Character ch = new Character('s');
		char c = ch; // autoUnboxing Object->Primitive dataType

		char x = 'l';// Primitive DataType->Object
		Character cht = x; // autoBoxing

	}

}
