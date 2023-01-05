package ArrayWithObjects;

import java.util.Scanner;

public class MovieTheaterMain {

	public static void main(String[] args) {
		Theater tr[] = new Theater[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tr.length; i++) {
			System.out.println("Enter Theater Details Id and Name");
			int tid = sc.nextInt();
			String tName = sc.next();

			Movie mv[] = new Movie[2];
			for (int j = 0; j < mv.length; j++) {
				System.out.println("Enter Movie Id, Name And Realese-Year");
				int mid = sc.nextInt();
				String mName = sc.next();
				int year = sc.nextInt();

				mv[j] = new Movie(mid, mName, year);
			}
			tr[i] = new Theater(tid, tName, mv);

		}
		for (Theater th : tr) {
			System.out.println(th);
		}
		sc.close();

	}

}
