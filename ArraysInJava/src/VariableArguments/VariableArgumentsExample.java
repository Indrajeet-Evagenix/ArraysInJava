package VariableArguments;

public class VariableArgumentsExample {

	void add(int... marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println(sum);
		System.out.println("Percentage: " + sum / marks.length);
	}

	void mul(String name, int... marks) {
		System.out.println();
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println(sum);
		System.out.println("Percentage: " + sum / marks.length);
		System.out.println(name);
	}

	public static void main(String[] args) {
		VariableArgumentsExample va = new VariableArgumentsExample();

		va.add(85, 95, 87, 98);
		va.mul("Indrajeet", 85, 98);

	}

}
