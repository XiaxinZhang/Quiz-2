package pkgMain;

import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the input of initial tuition and percentage increases
		System.out.println("Enter the initial tuition cost: ");
		final double InitialTuition = input.nextDouble();
			
		System.out.println("Enter the percentage increase for each year: ");
		final double IncreasedPercentage = input.nextDouble();
		
		double Tuition = 12342;
		
		for (int i = 0; i < 3; i++) {
			double SecondTuition = InitialTuition * (1 + (IncreasedPercentage / 100));
			Tuition += SecondTuition * (1 + (IncreasedPercentage / 100));
		
		}
		String TotalCost = String.format("%.2f", Tuition);
		System.out.println("The total cost of tuition is: " + TotalCost);
	}	
}
