
public class Exmple123 {

	public static void main(String[] args) {
		Car c1[] = new Car[2];

		Engine e1[] = new Engine[2];
		Engine e2[] = new Engine[2];

		e1[0] = new Engine(101, "type 1");
		e2[1] = new Engine(102, "type 2");

		c1[0] = new Car(1234, "Red", e1);
		c1[1] = new Car(1456, "Blue", e2);

		for (Car cr : c1) {
			System.out.println(cr);
		}

	}

}

class Car {
	int modelNumber;
	String color;

	Engine E[];

	Car(int mNumber, String col, Engine ex[]) {
		modelNumber = mNumber;
		color = col;
	}

	public String toString() {
		return "Model Number: " + modelNumber + ", Color: " + color;
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