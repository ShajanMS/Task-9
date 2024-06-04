package tasK9;

import java.util.Scanner;

public class Task9_2 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String reversedString = reverseString(input);

       
        System.out.println("Reversed string: " + reversedString);

        
        scanner.close();
    }

   
    public static String reverseString(String input) 
    {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
            
        }
        return reversed.toString();
    }

	}


