
public class tryCatchException {

	public static void main(String[] args) {
		int a = 200, b = 0;
		int arr[] = { 10, 20, 30, 40, 50 };
		String s = "India";
		String st = null;

		try {
			try {
				try {
					try {
						System.out.println("Division is: " + (a / b));
					} catch (ArithmeticException e) {
						e.printStackTrace();
					}
					System.out.println("Element at index: " + arr[10]);
				} catch (ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
				System.out.println("Character at: " + s.charAt(6));
			} catch (StringIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			System.out.println(st.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

}
