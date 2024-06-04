package tasK9;

import java.util.Scanner;

public class Task9_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        
        int num = 1;

       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); 
        }

        
        scanner.close();


	}

}
