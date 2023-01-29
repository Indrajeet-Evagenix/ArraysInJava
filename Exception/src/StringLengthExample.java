
public class StringLengthExample {

	int getStringLength(String s) throws NullPointerException // Halt Your Program Execution // Calling Method
	{
		return s.length();
	}

//	void StringOprations(String s) {
//		try {
//			System.out.println(getStringLength(s));
//			System.out.println(s.toLowerCase());
//			System.out.println(s.toUpperCase());
//		} catch (NullPointerException e) {
//
//		}
//	}

//	void StringOprations(String s) throws NullPointerException {
//		System.out.println(getStringLength(s));
//
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//	}

	void StringOprations(String s) {
		try {
			System.out.println(getStringLength(s));
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

	public static void main(String[] args) {
		StringLengthExample sl = new StringLengthExample();

//		System.out.println(sl.getStringLength("Mumbai"));
//		System.out.println(sl.getStringLength("India"));
//		try {
//
//			System.out.println(sl.getStringLength(null));
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println(sl.getStringLength("Language"));
//		System.out.println(sl.getStringLength("Java"));

		sl.StringOprations("Mumbai");
		sl.StringOprations("Marine Lines");

		sl.StringOprations(null);

		sl.StringOprations("India");
		sl.StringOprations("Language");

	}

}
