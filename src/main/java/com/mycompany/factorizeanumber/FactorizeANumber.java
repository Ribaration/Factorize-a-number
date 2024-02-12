/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorizeanumber;

/**
 *
 * @author Ribaration
 */

// Import the Scanner class from the java.util package for user input
import java.util.Scanner; 

public class FactorizeANumber {
      // Define the main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 
        // Prompt the user to enter a number
        System.out.println("Enter a number: "); 
        // Read the input number
        int num = scanner.nextInt(); 
        scanner.close(); // Close the Scanner object to release system resources
         
        // Print the message indicating the prime factors

        System.out.println("Prime factors of " + num + ":"); 
        
        // Find and print prime factors
        for (int i = 2; i <= num; i++) { // Iterate from 2 to the input number
            while (num % i == 0) { // Check if 'i' is a factor of the input number
                System.out.println(i); // Print 'i' as it's a prime factor
                num /= i; // Divide the input number by 'i'
            }
        }
    }
    
}
