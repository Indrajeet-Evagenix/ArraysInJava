package ArrayWithObjects;

import java.util.Arrays;

public class Theater {
	int theaterId;
	String theaterName;

	Movie mov[];

	Theater(int id, String name, Movie mov[]) {
		theaterId = id;
		theaterName = name;
		this.mov = mov;
	}

	public String toString() {
		return theaterId + " " + theaterName + " " + Arrays.toString(mov);
	}

}
