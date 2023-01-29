
public class ArithmeticExceptionExample {

	void add(int a, int b) {
		System.out.println("Additon is: " + (a + b));
	}

	void substract(int a, int b) {
		System.out.println("Substraction is: " + (a - b));
	}

	void multiply(int a, int b) {
		System.out.println("Multiplication is: " + (a * b));
	}

	void divide(int a, int b) { // Called methods
		System.out.println("Division is: " + (a / b));
	}

	public static void main(String[] args) { // Calling Methods
		int a = 150, b = 0;

		ArithmeticExceptionExample ex = new ArithmeticExceptionExample();

		ex.add(a, b);
		ex.substract(a, b);
		ex.multiply(a, b);

		try {// we can do in methods also
			ex.divide(a, b);
		} catch (ArithmeticException e) { // Upcasting - Dynamic Dispatch Method
			System.out.println(e);
//			e.printStackTrace();
		}

	}

}
