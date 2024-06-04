package tasK9;

import java.util.Scanner;

public class Task9_6 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month number: ");
        int month = scanner.nextInt();
     
        System.out.print("Enter the room rent per day: ");
        double roomRentPerDay = scanner.nextDouble();
 
        System.out.print("Enter the number of days stayed: ");
        int numberOfDays = scanner.nextInt();
      
        switch (month) {
            case 4: 
            case 5: 
            case 6: 
            case 11: 
            case 12: 
                roomRentPerDay *= 1.20; 
                break;
            default:
                
                break;
        }
  
        double totalTariff = roomRentPerDay * numberOfDays;
       
        System.out.printf("%.2f%n", totalTariff);

        scanner.close();
    }
}

