package tasK9;

import java.util.Scanner;

public class Task9_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n) {
				System.out.println("* *");
			} else if (i == 3) {
				System.out.println("*");
			} else {
				System.out.println("**");
			}
		}
		scanner.close();

	}

}
