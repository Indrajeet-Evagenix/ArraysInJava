package ArrayWithObjects;

public class Movie {
	int movieId, realeaseYear;
	String movieName;

	Movie(int id, String name, int year) {
		movieId = id;
		realeaseYear = year;
		movieName = name;
	}

	public String toString() {
		return movieId + " " + movieName + " " + realeaseYear;

	}

}
