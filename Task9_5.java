package tasK9;

import java.util.Scanner;

public class Task9_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        
        if (marks > 100) {
            System.out.println("Invalid Input");
        } else if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else if (marks >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        scanner.close();

	}

}
