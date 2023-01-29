package Enum;

interface SeasonDetails {
	void discription();
}

public enum Season implements SeasonDetails {

	RAINY {

		@Override
		public void discription() {
			System.out.println("Rainy Season");

		}
	},
	WINTER {

		@Override
		public void discription() {
			System.out.println("Winter Season");

		}
	},
	SUMMER {

		@Override
		public void discription() {
			System.out.println("Summer Season");

		}
	};
}
