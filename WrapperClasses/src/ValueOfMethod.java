
public class ValueOfMethod {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(100);
		System.out.println(i);

		Integer i1 = Integer.valueOf("1000");// Numerical String
		System.out.println(i1);

		Integer i2 = Integer.valueOf("101", 2);// +1*2^2   +0*2^1    +1*2^0
		System.out.println(i2);					// 4+0+1=5

		Float f = Float.valueOf(52.5f);
		System.out.println(f);

	}

}
