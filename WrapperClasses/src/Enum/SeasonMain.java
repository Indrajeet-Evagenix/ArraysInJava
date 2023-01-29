package Enum;

public class SeasonMain {

	public static void main(String[] args) {
		Season s[] = Season.values();
		for (Season s1 : s) {
			System.out.println(s1);
			s1.discription();
		}

	}

}
