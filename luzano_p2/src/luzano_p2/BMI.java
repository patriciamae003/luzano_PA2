package luzano_p2;

import java.util.Scanner;

public class BMI {

	/*
	 * This program takes weight and height as input, then calculate the BMI.
	 * It allows user to choose which BMI calculation method to use.
	 */
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String mode;
		double weight;
		double height;
		double bmi;
		
		// Asks user which calculation mode he/she prefers
		System.out.println("Enter calculation mode (lb or kg): ");
		mode = scnr.next();
		
		// Calculation if enters lb
		if(mode.equals("lb")) {
			System.out.println("Enter weight (lb): ");
			weight = scnr.nextDouble();
			System.out.println("Enter height (in): ");
			height = scnr.nextDouble();
			
			bmi = (703 * weight) / (Math.pow(height, 2));
			System.out.println("Your BMI is: " + bmi);
		}
		
		// Calculation if user enters kg
		else {
			System.out.println("Enter weight (kg): ");
			weight = scnr.nextDouble();
			System.out.println("Enter height (m): ");
			height = scnr.nextDouble();
			
			bmi = weight / (Math.pow(height, 2));
			System.out.println("Your BMI is: " + bmi);
		}
		
		// BMI categories
		System.out.println("\nBMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
	}

}
