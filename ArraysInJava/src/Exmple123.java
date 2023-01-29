import java.util.Arrays;

public class Exmple123 {

	public static void main(String[] args) {
		Car c1[] = new Car[1];

		Engine e1[] = new Engine[2];
		Engine e2[] = new Engine[2];

		e1[0] = new Engine(101, "type 1");
		e1[1] = new Engine(102, "type 2");

		c1[0] = new Car(1234, "Red", e1);
//		c1[1] = new Car(1456, "Blue", e2);

		// Object Creating And Printing
//		Car c1 = new Car(1234, "Red", e1);
//		System.out.println(c1);

		for (Car cr : c1) {
			System.out.println(cr);
		}

	}

}

class Car {
	int modelNumber;
	String color;

	Engine ex[];

	Car(int mNumber, String col, Engine ex[]) {
		modelNumber = mNumber;
		color = col;
		this.ex = ex;
	}

	public String toString() {
		return "Model Number: " + modelNumber + ", Color: " + color + ", Engine: " + Arrays.toString(ex);
	}

}

class Engine {
	int engineId;
	String engineType;

	Engine(int id, String engineType) {
		engineId = id;
		this.engineType = engineType;
	}

	public String toString() {
		return "Id: " + engineId + ", Type: " + engineType;
	}
}