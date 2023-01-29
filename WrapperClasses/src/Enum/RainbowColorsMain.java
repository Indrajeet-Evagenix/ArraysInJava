package Enum;

public class RainbowColorsMain {

	public static void main(String[] args) {
		RainbowColors rc1 = RainbowColors.RED;

//		System.out.println(rc1.ordinal());

		RainbowColors rbc[] = RainbowColors.values();
		for (RainbowColors rc : rbc) {
			System.out.println(rc.ordinal() + " " + rc);
//			rc.display();
		}

	}

}
