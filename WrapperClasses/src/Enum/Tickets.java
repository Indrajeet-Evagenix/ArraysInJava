package Enum;

public enum Tickets {

	SILVER(150) {
		public String toString() {

			return "Silver Category Rate is 150/-";
		}
	},
	GOLD(200) {
		public String toString() {

			return "Gold Category Rate is 200/-";
		}
	},
	PLATINUM(250) {
		public String toString() {

			return "Platinum Category Rate is 250/-";
		}
	};

	int rate;

	private Tickets(int rate) {
		this.rate = rate;
	}
}
