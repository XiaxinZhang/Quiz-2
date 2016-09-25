package pkgMain;

import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the input of initial tuition and percentage increases
		System.out.println("Enter the initial tuition cost: ");
		final double InitialTuition = input.nextDouble();
		
		double[] rates = new double[3];
		for (int i = 2; i < 5; i++){
			
			System.out.println("Enter the percentage increase for each year: ");
			double IncreasingRate = input.nextDouble();
			rates[i-2] = IncreasingRate;
		}
		
		input.close();
		
		String ResTotTui = String.format("%.2f", TotalTuition(InitialTuition,rates));
		System.out.println("The total cost of tuition is $ " + ResTotTui);
		
	}
	
	public static double TotalTuition(double InitialVal, double[]RateList) {
		
		// Calculate the total tuition cost
		double SemesterCost = InitialVal;
		double TotalCost = InitialVal;
		
		for (int i = 0; i < 3; i++){
			SemesterCost = SemesterCost * (1 + (RateList[i] / 100));
			TotalCost += SemesterCost;
			
		}
		return TotalCost;
	}

}
