
public class CustomThrowMessage {

	int getStringLength(String s) throws NullPointerException {
		if (s == null) {
			throw new NullPointerException("String is Null.... Null String is Not Allowed");
		}
		return s.length();
	}

	public static void main(String[] args) {

//		String str = "Mumbai";
		CustomThrowMessage sl = new CustomThrowMessage();
		System.out.println(sl.getStringLength("Mumbai"));
		System.out.println(sl.getStringLength("India"));
		try {

			System.out.println(sl.getStringLength(null));
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println(sl.getStringLength("Language"));
		System.out.println(sl.getStringLength("Java"));

	}

}
