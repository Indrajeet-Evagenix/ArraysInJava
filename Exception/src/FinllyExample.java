
public class FinllyExample {

	public static void main(String[] args) {
		int a = 200, b = 0;

		try {
			System.out.println("Division is: " + (a / b));
		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		}

		// can we write try Block in single ?
		// Yes we can write try Block in single with finally or catch Block
		finally {
			System.out.println("This is Finally Block");
		}

		System.out.println("Done");

	}

}
